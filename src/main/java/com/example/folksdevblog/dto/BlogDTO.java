package com.example.folksdevblog.dto;

import com.example.folksdevblog.model.Author;

import java.time.LocalDateTime;

public class BlogDTO {

    private String content;
    private Author author;
    private LocalDateTime createdDate = LocalDateTime.now();
    private LocalDateTime updatedDate = LocalDateTime.now();
}
