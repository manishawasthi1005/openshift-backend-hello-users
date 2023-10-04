package com.test.sb.hellosbusers.controller;

import com.test.sb.hellosbusers.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsersController {
    List<User> usersList = new ArrayList<User>();
    @GetMapping("/users")
    public List<User> getUsers(){
        usersList.add(new User("1", "testFirstName1", "testLastname1", "testName1@email.com"));
        usersList.add(new User("2", "testFirstName2", "testLastname2", "testName2@email.com"));
        usersList.add(new User("3", "testFirstName3", "testLastname3", "testName3@email.com"));

        return usersList;
    }
}
