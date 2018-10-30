package com.lsh.boot.consumer.order;

import com.lsh.boot.api.model.Order;
import com.lsh.boot.consumer.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project Name: boot-demo
 * Created by peter on 18/10/28.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Controller
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @ResponseBody
    @RequestMapping("/one")
    public Order getOrder(){

       return  orderService.getOrderOne();
    }
}
