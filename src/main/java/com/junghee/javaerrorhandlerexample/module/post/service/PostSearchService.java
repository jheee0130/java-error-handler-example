package com.junghee.javaerrorhandlerexample.module.post.service;

import com.junghee.javaerrorhandlerexample.global.error.BusinessException;
import com.junghee.javaerrorhandlerexample.global.error.ErrorCode;
import com.junghee.javaerrorhandlerexample.module.post.repository.PostRepository;
import com.junghee.javaerrorhandlerexample.module.post.request.PostRequest;
import com.junghee.javaerrorhandlerexample.module.post.response.PostInfoResponse;
import com.junghee.javaerrorhandlerexample.module.post.response.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostSearchService {

    private final PostRepository postRepository;

    public PostInfoResponse getPost(PostRequest request) {
        return postRepository.findById(request.id())
            .map(PostInfoResponse::toResponse)
            .orElseThrow(() -> new BusinessException(ErrorCode.USER_NOT_FOUND));
    }

    public PostResponse getPostList() {
        final var list = postRepository.findAll().stream()
            .map(PostInfoResponse::toResponse)
            .toList();

        return PostResponse.toResponse(list);
    }

}
