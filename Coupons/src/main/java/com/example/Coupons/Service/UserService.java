package com.example.Coupons.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Coupons.Model.User;
import com.example.Coupons.Repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public String addUser( User user) {
        userRepository.save(user);
        return "New User Added";
    }


    public String deleteUser( String userID) {
        userRepository.deleteById(userID);
        return "User deleted";
    }


    public User updateUser( User user, String userID) {
        return userRepository.save(user);
    }
}