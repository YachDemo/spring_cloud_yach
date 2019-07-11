package com.yach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置文件读取中心
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient     //向服务中心注册
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        System.out.println("==================================SpringApplication Start==============================");
    }

}
