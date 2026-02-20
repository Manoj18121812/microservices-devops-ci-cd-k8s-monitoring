package com.example.User_service.service;

import com.example.User_service.Entity.User;
import com.example.User_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repo;

    public List<User> listAll() {
        return repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
