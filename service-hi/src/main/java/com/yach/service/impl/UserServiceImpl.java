package com.yach.service.impl;

import com.yach.dao.UserDao;
import com.yach.pojo.User;
import com.yach.service.UserService;
import com.yach.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * user实现
 * Created by Yach on 2019/7/11
 * @version v1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    private final static long USER_WORK_ID = 1L;
    private final static long USER_DATA_CENTER_ID = 1L;

    @Override
    public RtnResult registered(String userName, String password) {
        //生成id（策略：雪花算法）
        SnowflakeUtils snowflakeUtils = new SnowflakeUtils(USER_WORK_ID,USER_DATA_CENTER_ID);
        Long id = snowflakeUtils.nextId();
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setPassword(password);
        String token = OnlyUtils.uuid();
        user.setToken(token);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(ConstantUtils.FALSE_DELETE);
        int flag = userDao.addUser(user);
        if (flag > 0){
            return new RtnResult(WebUtils.SUCCESS_RESULT,WebUtils.SUCCESS_CODE,WebUtils.SUCCESS_MESSAGE,user);
        }
        return new RtnResult(WebUtils.ERROR_RESULT,WebUtils.ERROR_CODE,WebUtils.ERROR_MESSAGE);
    }
}
