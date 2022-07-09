package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhangY on 2022/5/18 22:07
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class cloud8001 {
    public static void main(String[] args) {
        SpringApplication.run(cloud8001.class,args);
    }
}
