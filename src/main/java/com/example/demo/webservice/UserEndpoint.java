package com.example.demo.webservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

// Generar un archivo wsdl: wsgen -cp build/classes/java/main com.example.demo.webservice.UserEndpoint -wsdl -keep

@WebService
public class UserEndpoint {
    @Autowired
    private UserService userService;

    @WebMethod
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @WebMethod
    public UserModel getUserById(@WebParam(name = "id") Long id) {
        return userService.getUserById(id);
    }

    @WebMethod
    public UserModel createUser(@WebParam(name = "user") UserModel user) {
        return userService.createUser(user);
    }

    @WebMethod
    public UserModel updateUser(@WebParam(name = "id") Long id, @WebParam(name = "user") UserModel user) {
        return userService.updateUser(id, user);
    }

    @WebMethod
    public void deleteUser(@WebParam(name = "id") Long id) {
        userService.deleteUser(id);
    }
}