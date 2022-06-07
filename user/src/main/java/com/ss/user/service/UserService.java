package com.ss.user.service;

import com.ss.user.model.User;
import com.ss.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public List<User> getAllUsers(){
        return (List<User>) userRepo.findAll();
    }

    public User createUser(){
        User user = new User("Vikas", "0123456789", "vikaspandey38z@gmail.com");
        return userRepo.save(user);
    }
}
