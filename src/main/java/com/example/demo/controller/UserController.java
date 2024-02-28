package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }
    

    @GET
    @Path("/getUserById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserModel getUserById(@PathParam("id") Long id) {
        return userService.getUserById(id);
    }


    @POST
    @Path("/createUser")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.createUser(user);
    }


    @PUT
    @Path("/updateUser/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public UserModel updateUser(@PathParam("id") Long id, @RequestBody UserModel user) {
        return userService.updateUser(id, user);
    }

    @DELETE
    @Path("/deleteUser/{id}")
    public void deleteUser(@PathParam("id") Long id) {
        userService.deleteUser(id);
    }
}

