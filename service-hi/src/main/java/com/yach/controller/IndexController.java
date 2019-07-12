package com.yach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Yach on 2019/7/12
 *
 * @version v4.0
 */
@Controller
@RequestMapping("yach")
@CrossOrigin("*")
public class IndexController {
    /**
     * 加载初始页面
     * @return
     */
    @RequestMapping("index")
    public String indexHtml(){
        return "index";
    }

    /**
     * 处理加载请求
     * @return
     */
    @RequestMapping("jump")
    @ResponseBody
    public Boolean jumpHtml(){
        return true;
    }

}
