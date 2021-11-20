package com.example.folksdevblog.repository;

import com.example.folksdevblog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
