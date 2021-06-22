package com.example.enrollmentsystem.User.controller;

import com.example.enrollmentsystem.CourseStudent.model.CourseStudent;
import com.example.enrollmentsystem.User.model.Role;
import com.example.enrollmentsystem.User.model.User;
import com.example.enrollmentsystem.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/user/registration")
    public ResponseEntity<?> register(@RequestBody User user){
//        if(userService.findByUsername(user.getUsername()) !=null){
//            return new ResponseEntity<>(HttpStatus.CONFLICT);
//        }
        user.setRole(Role.STUDENT);
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }
}
