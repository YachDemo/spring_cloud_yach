package com.yach.controller;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Yach on 2019/7/11
 *
 * @version v4.0
 */
@RestController
public class MiyaController {
    private static Logger logger = Logger.getLogger(MiyaController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 注入bean
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/hi")
    public String home(){
        logger.log(Level.INFO,"hi is being called");
        return "i am miya";
    }

    @RequestMapping("/miya")
    public String info(){
        logger.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8772/info",String.class);
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
