package com.ahmetsenocak.website.repos;

import com.ahmetsenocak.website.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
