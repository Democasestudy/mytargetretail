package com.casestudy.myretail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyretailController {

    @GetMapping(path="/casestudy")
    public String getTestMessage(){
        return "Case study super success";
    }

}
