package com.ahmetsenocak.website.repos;

import com.ahmetsenocak.website.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like,Long> {
}
