package com.example.spring.heroku.shop.api;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public List<Product> getAllProduct() {
        return Arrays.asList(
            new Product("100001", "MacBook Pro", "You want believe it!", "Laptop", 1140),
            new Product("100002", "MacBook Air", "You want believe it!", "Laptop", 1020),
            new Product("100003", "MacBook Pro", "You want believe it!", "Laptop", 1660),
            new Product("100004", "Iphone X", "You want believe it!", "Laptop", 1200),
            new Product("100005", "Iphone 11", "You want believe it!", "Laptop", 1070),
            new Product("100006", "Iphone 12", "That's crazy future technology!", "Phone", 1350)
        );
    }

    @GetMapping("/message/{input}")
    public String getMessage(@PathVariable String input){
        return "Welcome! " + input;
    }
}


