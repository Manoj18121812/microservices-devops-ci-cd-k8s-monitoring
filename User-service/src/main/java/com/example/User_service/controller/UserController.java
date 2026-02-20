package com.example.User_service.controller;

import com.example.User_service.Entity.User;
import com.example.User_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("list", service.listAll());

        return "index";
    }

    @GetMapping("/new")
    public String addUser(Model model) {

        model.addAttribute("user", new User());

        return "add";
    }

    @PostMapping("/save")
    public String saveUser(User user) {

        service.save(user);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        service.delete(id);

        return "redirect:/";
    }
}
