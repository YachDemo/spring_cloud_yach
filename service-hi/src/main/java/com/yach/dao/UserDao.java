package com.yach.dao;


import com.yach.pojo.User;
import com.yach.util.RtnResult;

/**
 * 用户dao
 * Created by Yach on 2019/7/11
 * @version v4.0
 */
public interface UserDao {

    /**
     * 新增
     * @param user
     * @return
     */
    int addUser(User user);
}
