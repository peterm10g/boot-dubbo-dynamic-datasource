package com.lsh.boot.core.service.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lsh.boot.core.entity.User;
import com.lsh.boot.core.mapper.UserMapper;
import com.lsh.boot.core.service.UserService;
import org.springframework.stereotype.Service;

@Service
@DS("slave")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    @DS("master")//这里必须包一层，不能调用mp默认的插入，因为会走到从库去
    public void addUser(User user) {
        baseMapper.insert(user);
    }

    @Override
    @DS("slave")
    public User selectOne(Integer userId) {
        return baseMapper.selectById(2);
    }
}
