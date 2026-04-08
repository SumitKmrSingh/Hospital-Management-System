package com.hms.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hms.main.dto.LoginRequest;
import com.hms.main.dto.SignupRequest;
import com.hms.main.models.User;
import com.hms.main.repository.UserRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    // Signup
    public String registerUser(SignupRequest request) {

        // ⭐ email check
        if (userRepository.existsByEmail(request.getEmail())) {
            return "Email already registered. Please login or use another email.";
        }

        User user = new User();

        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole(request.getRole());
        user.setMobileNo(request.getMobileNo());

        user.setPassword(passwordEncoder.encode(request.getPassword())); // encrypted


        userRepository.save(user);

        return "Signup successfully!";
    }


    // Login
    public String login(LoginRequest request) {

        User user = userRepository
                .findByUsername(request.getUsername())
                .orElse(null);

        if (user == null) {
            return "User not found";
        }

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return "Invalid password";
        }

        return "Login successful";
    }

}
