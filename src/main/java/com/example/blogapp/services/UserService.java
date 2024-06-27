package com.example.blogapp.services;

import com.example.blogapp.models.Post;
import com.example.blogapp.models.User;
import com.example.blogapp.repositories.UserRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

     public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    // Other methods for user management
}