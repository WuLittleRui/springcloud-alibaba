package com.wurui.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface OrderService {
    @GetMapping("/hi")
    public String hi();
}
