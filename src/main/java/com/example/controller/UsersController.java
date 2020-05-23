package com.example.controller;



import com.example.Service.UsersService;
import com.example.entity.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;


    @PostMapping("/users")
    public Users createUser(@Valid @RequestBody Users user) throws Exception {
       Users users = usersService.registerUser(user);
        return users;
    }

    @GetMapping("/users")
    public List<Users> fetchAllUsers(){
        return usersService.getAllUsers();
    }


}
