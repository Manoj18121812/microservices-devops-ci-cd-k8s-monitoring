package com.example.Product_service.controller;

import com.example.Product_service.Entity.Product;
import com.example.Product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("list", service.listAll());

        return "index";

    }

    @GetMapping("/new")
    public String addProduct(Model model) {

        model.addAttribute("product", new Product());

        return "add";

    }

    @PostMapping("/save")
    public String save(Product product) {

        service.save(product);

        return "redirect:/";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        service.delete(id);

        return "redirect:/";

    }

}
