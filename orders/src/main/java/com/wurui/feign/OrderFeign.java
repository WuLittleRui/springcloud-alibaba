package com.wurui.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wurui
 * @description TODO
 * @Date 2020-08-24 13:46
 **/
@RestController
@RequestMapping("/order")
public class OrderFeign {
    @GetMapping("/hi")
    public String hi() {
        return "order";
    }
}
