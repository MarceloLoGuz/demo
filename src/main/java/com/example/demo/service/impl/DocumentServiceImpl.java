package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.DocumentModel;
import com.example.demo.repository.DocumentRepository;
import com.example.demo.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public List<DocumentModel> getAllDocuments() {
        return documentRepository.findAll();
    }

    @Override
    public List<Map<String, String>> uploadDocument(List<Map<String, String>> files) {

        for (Map<String, String> file : files) {
            try {
                DocumentModel document = new DocumentModel();
                document.setFileName(file.get("fileName"));
                document.setContentType(file.get("contentType"));
                document.setData(file.get("data"));

                documentRepository.save(document);
            } catch (Exception e) {
                return null;
            }

        }

        return files;
    }
}
