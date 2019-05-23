package com.yach.controller;

import com.yach.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yach on 2019/5/23.
 * version v4.0.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/ribbonHi")
    public String hi(@RequestParam(value = "name",defaultValue = "yach") String name){
        return helloService.hiService(name);
    }
}
