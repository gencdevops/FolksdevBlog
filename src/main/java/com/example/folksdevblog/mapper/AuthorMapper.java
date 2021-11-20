package com.example.folksdevblog.mapper;

import com.example.folksdevblog.dto.AuthorDTO;
import com.example.folksdevblog.model.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author toAuthor(AuthorDTO authorDTO);
    AuthorDTO toAuthorDTO(Author author);
}
