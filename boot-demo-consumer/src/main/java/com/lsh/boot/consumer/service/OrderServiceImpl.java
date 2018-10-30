package com.lsh.boot.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lsh.boot.api.model.Order;
import com.lsh.boot.api.order.IOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Project Name: boot-demo
 * Created by peter on 18/10/28.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Service
public class OrderServiceImpl {

    @Reference(loadbalance="random",timeout=1000)
    private IOrderService orderService;

    @HystrixCommand(fallbackMethod="getOrderHys")
    public Order getOrderOne() {
        return orderService.getOrderOne();
    }

    public Order getOrderHys() {
        // TODO Auto-generated method stub

        return new Order("测试地址", "1-name");
    }
}
