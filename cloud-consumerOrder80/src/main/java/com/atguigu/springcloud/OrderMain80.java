package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhangY on 2022/6/1 22:51
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main( String[] args ){
        SpringApplication.run(OrderMain80.class, args);
    }
}
