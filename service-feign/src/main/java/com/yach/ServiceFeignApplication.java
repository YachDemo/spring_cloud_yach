package com.yach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * feign做负载均衡（消费者）
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务中心注册
@EnableFeignClients //开启feign
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
        System.out.println("====================ServiceFeignApplication start ===================");
    }

}
