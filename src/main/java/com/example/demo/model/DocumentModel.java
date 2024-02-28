package com.example.demo.model;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Entity
@Table(name = "documents")
@Data
public class DocumentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(unique = false, nullable = false)
    private String fileName;

    @Column(unique = false, nullable = false)
    private String contentType;

    @Column(unique = false, nullable = false)
    private String data;
}
