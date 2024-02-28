package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserModel getUserById(Long id) {
        Optional<UserModel> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public UserModel createUser(UserModel user) {
        UserModel userModel = new UserModel();
        userModel.setUsername(user.getUsername());
        userModel.setFullName(user.getFullName());
        userModel.setEmail(user.getEmail());
        userModel.setPhoneNumber(user.getPhoneNumber());
        userModel.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(userModel);
    }

    @Override
    public UserModel updateUser(Long id, UserModel user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
