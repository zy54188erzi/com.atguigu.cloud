package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhangY on 2022/5/18 22:07
 */
@SpringBootApplication
@EnableEurekaClient
public class Cloud8002 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud8002.class,args);
    }
}
