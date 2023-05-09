package com.ahmetsenocak.website.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "comment")
@Data
public class Comment {

    @Id
    Long id;
    Long postId;
    Long userId;

    @Lob
    @Column(columnDefinition = "text")
    String text;
}
