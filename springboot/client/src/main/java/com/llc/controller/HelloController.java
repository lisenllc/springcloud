package com.llc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

  @Autowired RestTemplate restTemplate;

  @Value("${name}")
  String foo;

  @RequestMapping("/")
  @HystrixCommand(fallbackMethod = "hiError")
  public String home() {
    return restTemplate.getForObject("http://SERVER/", String.class);
  }

  public String hiError() {
    return foo+"hi,sorry,error!";
  }
}
