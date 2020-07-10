/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.exception;

import com.casestudy.myretail.price.ProductNotFound;
import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class MyRetailExceptionhandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExcpetions(Exception ex , WebRequest request){
    ExceptionResponse exceptionResponse =    new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
    return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ProductNotFound.class)
    public final ResponseEntity<Object> handleproductNotFoundExcpetions(Exception ex , WebRequest request){
        ExceptionResponse exceptionResponse =    new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
        ExceptionResponse exceptionResponse =    new ExceptionResponse(new Date(),"myRetail Validation Error.",ex.getBindingResult().toString());
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
