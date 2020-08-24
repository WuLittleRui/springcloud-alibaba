package com.wurui.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface ProductService {
    @GetMapping("/hi")
    public String hi();
}
