package com.example.Coupons.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Coupons.Model.User;
import com.example.Coupons.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/list")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping(value = "/{UserID}")
    public String deleteUser(@PathVariable String userID) {
        return userService.deleteUser(userID);
    }

    @PutMapping(value = "/{UserID}")
    public User updateUser(@RequestBody User user, @PathVariable String userID) {
        return userService.updateUser(user, userID);
    }
}
