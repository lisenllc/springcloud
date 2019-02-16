package com.llc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    //  @Value("${neo.hello}")
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }

//  @RequestMapping("/")
//  @HystrixCommand(fallbackMethod = "hiError")
//  public String home() {
//    return restTemplate.getForObject("http://SERVER/", String.class);
//  }

    public String hiError() {
        return "hi,sorry,error!";
    }
}
