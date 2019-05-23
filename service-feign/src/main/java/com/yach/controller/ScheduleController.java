package com.yach.controller;

import com.yach.feign.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对外暴露接口
 * Created by Yach on 2019/5/23.
 * version v4.0.
 */
@RestController
public class ScheduleController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @GetMapping("/sayHiByFeign")
    public String sayHiByFeign(@RequestParam(value = "name") String name){
        return scheduleServiceHi.sayHiByFeign(name);
    }
}
