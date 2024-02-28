package com.example.demo.webservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.DocumentModel;
import com.example.demo.service.DocumentService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import java.util.List;
import java.util.Map;

// Generar un archivo wsdl: wsgen -cp build/classes/java/main com.example.demo.webservice.UserEndpoint -wsdl -keep

@WebService
public class DocumentEndpoint {
    @Autowired
    private DocumentService documentService;

    @WebMethod
    public List<DocumentModel> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @WebMethod
    public List<Map<String, String>> uploadDocument(@WebParam(name = "files") List<Map<String, String>> files) {
        return documentService.uploadDocument(files);
    }
}