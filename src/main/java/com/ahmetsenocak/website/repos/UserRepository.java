package com.ahmetsenocak.website.repos;

import com.ahmetsenocak.website.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
