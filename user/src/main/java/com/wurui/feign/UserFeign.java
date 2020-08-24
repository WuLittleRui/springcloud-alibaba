package com.wurui.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wurui
 * @description TODO
 * @Date 2020-08-24 13:47
 **/
@RestController
@RequestMapping("/user")
public class UserFeign {
    @GetMapping("/hi")
    public String hi() {
        return "user";
    }
}
