package com.example.demo.service;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.example.demo.model.DocumentModel;

public interface DocumentService {
    List<DocumentModel> getAllDocuments();

    List<Map<String, String>> uploadDocument(@NotNull List<Map<String, String>> files);
}
