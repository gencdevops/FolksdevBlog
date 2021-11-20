package com.example.folksdevblog.mapper;

import com.example.folksdevblog.dto.BlogDTO;
import com.example.folksdevblog.model.Blog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlogMapper {
    Blog toBlog(BlogDTO blogDTO);
    BlogDTO toBlogDTO(Blog blog);

}
