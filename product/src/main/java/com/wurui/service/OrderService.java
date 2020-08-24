package com.wurui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product")
public interface OrderService {
    @GetMapping("/hi")
    public String hi();
}
