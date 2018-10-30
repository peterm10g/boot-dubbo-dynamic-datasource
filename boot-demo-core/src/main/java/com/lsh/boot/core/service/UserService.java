package com.lsh.boot.core.service;


import com.baomidou.mybatisplus.service.IService;
import com.lsh.boot.core.entity.User;

public interface UserService extends IService<User> {

    void addUser(User user);

    User selectOne(Integer userId);

}
