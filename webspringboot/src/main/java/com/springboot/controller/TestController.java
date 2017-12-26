package com.springboot.controller;

import com.springboot.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    public TestProperties testProperties;

    @RequestMapping("/test")
    @ResponseBody
    public String  test(){
        return testProperties.getName();
    }
}
