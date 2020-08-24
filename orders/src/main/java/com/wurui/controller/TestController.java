package com.wurui.controller;

import com.wurui.service.ProductService;
import com.wurui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author wurui
 * @description TODO
 * @Date 2020-08-24 13:53
 **/
@RequestMapping("/order")
public class TestController {
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hi() {
        return productService.hi() + userService.hi();
    }
}
