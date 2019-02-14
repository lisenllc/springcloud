package com.llc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.llc")
public class ServerApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(ServerApplication.class).web(true).run(args);
  }
}
