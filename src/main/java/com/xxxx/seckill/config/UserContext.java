package com.xxxx.seckill.config;

import com.xxxx.seckill.pojo.User;

/**
 * @program: seckill-demo
 * @author: onion
 * @create: 2021-02-17 16:01
 **/

public class UserContext {

    private static ThreadLocal<User> userHolder = new ThreadLocal<User>();

    public static void setUser(User user) {
        userHolder.set(user);
    }

    public static User getUser() {
        return userHolder.get();
    }
}
    