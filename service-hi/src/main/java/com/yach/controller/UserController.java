package com.yach.controller;

import com.yach.service.UserService;
import com.yach.util.RtnResult;
import com.yach.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Yach on 2019/7/11
 * @version v1.0
 */
@RestController
@RequestMapping("/yach/user/")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param userName
     * @param password
     * @return
     */
    @PostMapping("registered")
    public RtnResult registered(@RequestParam("userName") String userName,
                                @RequestParam("password") String password){
        if (userName.isEmpty() || password.isEmpty()){
            return new RtnResult(WebUtils.ERROR_RESULT,WebUtils.ERROR_CODE,"缺少参数！");
        }
        return userService.registered(userName,password);
    }

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    @PostMapping("login")
    public RtnResult login(@RequestParam("userName") String userName,
                                @RequestParam("password") String password){
        if (userName.isEmpty() || password.isEmpty()){
            return new RtnResult(WebUtils.ERROR_RESULT,WebUtils.ERROR_CODE,"缺少参数！");
        }
        return null;
    }
}
