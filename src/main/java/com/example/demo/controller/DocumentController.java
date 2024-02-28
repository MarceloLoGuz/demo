package com.example.demo.controller;

import com.example.demo.model.DocumentModel;
import com.example.demo.service.DocumentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/api/documents")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<DocumentModel> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @POST
    @Path("/upload")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Map<String, String>> uploadDocument(List<Map<String, String>> files) {
        return documentService.uploadDocument(files);
    }
}
