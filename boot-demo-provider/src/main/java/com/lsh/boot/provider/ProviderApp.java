package com.lsh.boot.provider;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
//@SpringBootApplication(scanBasePackages = {"com.lsh.boot.core"})
@SpringBootApplication(scanBasePackages = {"com.lsh.boot.core"}, exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.lsh.boot.core.mapper")
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
