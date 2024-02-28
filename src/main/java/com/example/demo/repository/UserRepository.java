package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long> {
    public UserModel findOneById(Long id);
    Optional<UserModel> findOneByUsername(String username);
}
