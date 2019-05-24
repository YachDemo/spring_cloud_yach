package com.yach.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.yach.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Yach on 2019/5/23.
 * version v4.0.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiServiceError")
    public String hiService(String name) {
        /**
         * 向restTemplate中发一个get请求，这里调用服务名而不是服务地址
         * String.class表示为我想要的返回值为String
         */
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiServiceError(String name){
        return "sorry,"+name;
    }
}
