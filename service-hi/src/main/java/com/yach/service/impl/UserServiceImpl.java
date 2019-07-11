package com.yach.service.impl;

import com.yach.dao.UserDao;
import com.yach.pojo.User;
import com.yach.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user实现
 * Created by Yach on 2019/7/11
 * @version v1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


}
