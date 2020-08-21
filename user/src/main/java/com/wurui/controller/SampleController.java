package com.wurui.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wurui
 * @description TODO
 * @Date 2020-08-21 13:35
 **/
@RequestMapping("/user")
@RestController
@RefreshScope
public class SampleController {
    @Value("${user.id}")
    private String id;

    @GetMapping("/simple")
    public String simple() {
        return "Hello Nacos User Config!" + "Hello " + id;
    }
}
