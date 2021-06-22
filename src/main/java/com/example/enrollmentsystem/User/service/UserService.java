package com.example.enrollmentsystem.User.service;

import com.example.enrollmentsystem.User.model.User;
import com.example.enrollmentsystem.User.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser(User newUser){
//        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        return userRepository.save(newUser);
    }


    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }
}
