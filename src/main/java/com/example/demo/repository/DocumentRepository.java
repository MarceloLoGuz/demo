package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DocumentModel;

public interface DocumentRepository extends JpaRepository<DocumentModel, Integer>{
    public DocumentModel findOneById(Integer id);
}
