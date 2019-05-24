package com.yach.hystric;

import com.yach.feign.ScheduleServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by Yach on 2019/5/24.
 * version v4.0.
 */

/**
 * 实现要熔断的类，并注入ioc
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiByFeign(String name) {
        System.out.println("-------------------------熔断");
        return "sorry,"+name;
    }
}
