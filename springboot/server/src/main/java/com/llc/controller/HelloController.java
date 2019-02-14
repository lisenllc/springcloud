package com.llc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
  @Value("${server.port}")
  public String port;

  @RequestMapping("/")
  public String home() {
    log.debug("Hello World,port:{}", port);
    return "Hello World,port:" + port;
  }
}
