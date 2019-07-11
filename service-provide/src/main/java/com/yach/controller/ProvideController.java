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
public class ProvideController {
    private static Logger logger = Logger.getLogger(ProvideController.class.getName());

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
    public String callHome(){
        logger.log(Level.INFO,"call trace service-provide");
        return restTemplate.getForObject("http://localhost:8773/miya",String.class);
    }

    @RequestMapping("/info")
    public String info(){
        logger.log(Level.INFO, "calling trace service-provide ");
        return "i am service-provide";
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
