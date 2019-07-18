package com.yach.service;

import com.yach.util.RtnResult;

/**
 * user接口
 * Created by Yach on 2019/7/11
 * @version v1.0
 */
public interface UserService {
    /**
     * 注册接口
     * @param userName
     * @param password
     * @return
     */
    RtnResult registered(String userName, String password);
}
