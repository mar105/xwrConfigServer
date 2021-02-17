package com.xwr.xwrConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient // 其他注册中心用到
@EnableEurekaClient   // Eureka注册中心用到
@RestController
public class XwrConfigServerApplication {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";//返回结果为字符串
    }
    public static void main(String[] args) {
        SpringApplication.run(XwrConfigServerApplication.class, args);
    }
}
