package com.lsh.boot.core.controller;

import com.lsh.boot.core.entity.User;
import com.lsh.boot.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Project Name: boot-demo
 * Created by peter on 18/10/29.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
//@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @ResponseBody
//    @RequestMapping("/user")
    public User selectOne(){

        return userService.selectOne(2);
    }
}
