package com.ahmetsenocak.website.repos;

import com.ahmetsenocak.website.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
