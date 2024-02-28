package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserModel;

public interface UserService {
    List<UserModel> getAllUsers();

    UserModel getUserById(Long id);

    UserModel createUser(UserModel user);

    UserModel updateUser(Long id, UserModel user);

    void deleteUser(Long id);
}