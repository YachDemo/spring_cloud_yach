package com.yach;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务提供者
 * 向注册中心注册时会发送心跳信息
 */
@SpringBootApplication(scanBasePackages = "com.yach",exclude = ErrorMvcAutoConfiguration.class)
@EnableEurekaClient //服务中心注册，服务提供
@MapperScan(basePackages = "com.yach.dao")
@ServletComponentScan
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
        System.out.println("=========================ServiceHiApplication start==============");
    }
}
