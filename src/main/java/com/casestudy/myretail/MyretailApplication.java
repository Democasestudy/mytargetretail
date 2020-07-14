/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableMongoRepositories("com.casestudy.myretail.mongodb.repository")
public class MyretailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyretailApplication.class, args);
    }
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
