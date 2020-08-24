package com.wurui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user")
public interface UserService {
    @GetMapping("/hi")
    public String hi();
}
