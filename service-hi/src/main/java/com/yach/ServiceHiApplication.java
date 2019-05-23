package com.yach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者
 * 向注册中心注册时会发送心跳信息
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
        System.out.println("=========================ServiceHiApplication start==============");
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String service_hi(@RequestParam(value = "name",defaultValue = "yach") String name){
        return "hi,"+name+" i am port:"+port;
    }
}
