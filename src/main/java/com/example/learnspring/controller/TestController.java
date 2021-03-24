package com.example.learnspring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;

@RestController
@RequestMapping("test")
@PropertySource(value = {
        "classpath:x1.properties"
})
public class TestController {

    //@Named("ASA")
    @Value("${spring.mydata2}")
    private volatile String params;
}
