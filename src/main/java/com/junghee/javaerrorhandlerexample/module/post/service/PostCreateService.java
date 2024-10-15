package com.junghee.javaerrorhandlerexample.module.post.service;

import com.junghee.javaerrorhandlerexample.module.post.repository.PostRepository;
import com.junghee.javaerrorhandlerexample.module.post.request.PostCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostCreateService {

    private final PostRepository postRepository;

    public void create(PostCreateRequest request) {
        postRepository.save(request.toEntity());
    }

}
