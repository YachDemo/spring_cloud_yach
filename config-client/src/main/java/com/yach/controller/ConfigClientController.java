package com.yach.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test
 * 读取配置服务文件
 * Created by Yach on 2019/7/10
 * @version v4.0
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${democonfigclient.message}")
    String foo;

    @GetMapping("/hi")
    public String hi(){
        return foo;
    }
}
