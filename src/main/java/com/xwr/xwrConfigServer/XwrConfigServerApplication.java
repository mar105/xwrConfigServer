package com.xwr.xwrConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient // 其他注册中心用到
@EnableEurekaClient   // Eureka注册中心用到
@RestController
public class XwrConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwrConfigServerApplication.class, args);
    }

}
