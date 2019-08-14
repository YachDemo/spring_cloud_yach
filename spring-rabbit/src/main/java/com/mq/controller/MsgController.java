package com.mq.controller;

import com.mq.component.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yach on 2019/8/14
 *
 * @version v4.0
 */
@RestController
public class MsgController {
    @Autowired
    MsgProducer msgProducer;

    @GetMapping("/test")
    public String msgTest(){
        msgProducer.sendMsg("这是一条测试rabbitMq消息!");
        return "msg";
    }
}
