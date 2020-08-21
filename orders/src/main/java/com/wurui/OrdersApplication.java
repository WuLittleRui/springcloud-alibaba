package com.wurui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author wurui
 * @description TODO
 * @Date 2020-08-21 11:57
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrdersApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
    }
}
