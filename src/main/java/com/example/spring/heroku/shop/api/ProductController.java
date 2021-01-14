package com.example.spring.heroku.shop.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Product> productList= Arrays.asList(
            new Product("100001", "MacBook Pro", "You want believe it!", "Laptop", 1140),
            new Product("100002", "MacBook Pro", "You want believe it!", "Laptop", 1140)
        );
        model.addAttribute("locationStats", productList);
        return "index";
    }

    @GetMapping("/products")
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
}


