package com.lsh.boot.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.lsh.boot.api.model.Order;
import com.lsh.boot.api.order.IOrderService;
import com.lsh.boot.core.entity.User;
import com.lsh.boot.core.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project Name: boot-demo
 * Created by peter on 18/10/28.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Service
@Slf4j
@Component
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private UserServiceImpl userService;


    @Override
    public Order getOrderOne() {

        User user = userService.selectOne(2);

        User user4add = new User();
        user4add.setName("peter");
        user4add.setAge(25);
        userService.addUser(user4add);

        log.info("depts {}",JSON.toJSONString(user));
        Order order = new Order();
        order.setId("id123223");
        order.setName("name-peter");
//        if (Math.random() > 0.5) {
//            throw new RuntimeException();
//        }
        return order;
    }
}
