package com.yach.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign指定发现调用服务
 *
 * Created by Yach on 2019/5/23.
 * version v4.0.
 */
@FeignClient(value = "service-hi")
public interface ScheduleServiceHi {
    @GetMapping(value = "/hi")
    String sayHiByFeign(@RequestParam("name") String name);
}
