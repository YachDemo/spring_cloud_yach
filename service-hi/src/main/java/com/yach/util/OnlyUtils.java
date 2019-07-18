package com.yach.util;

import java.util.UUID;

/**
 * uuid工具类
 * Created by Yach on 2019/7/18
 * @version v4.0
 */
public class OnlyUtils {
    public static String uuid(){
        String uuid = UUID.randomUUID().toString().replace("-","");
        return uuid;
    }
}
