package com.junghee.javaerrorhandlerexample.module.post.repository;

import com.junghee.javaerrorhandlerexample.module.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
