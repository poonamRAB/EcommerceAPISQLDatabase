package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String createUser(User user) {
        userRepo.save(user);
        return "User has been created";
    }

    public User getUserByUserId(Long userId) {
        return userRepo.findById(userId).get();
    }
}
