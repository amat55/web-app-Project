package com.ahmetsenocak.website.repos;

import com.ahmetsenocak.website.entities.Post;
import com.ahmetsenocak.website.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
