package com.junghee.javaerrorhandlerexample.module.post.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.ZonedDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post")
@NoArgsConstructor
@Getter
public class Post {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;

    @Builder
    public Post(Long id, String title, String content, ZonedDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }

}
