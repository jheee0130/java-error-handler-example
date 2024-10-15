package com.junghee.javaerrorhandlerexample.module.post.controller;

import com.junghee.javaerrorhandlerexample.global.error.ApiResponse;
import com.junghee.javaerrorhandlerexample.module.post.request.PostCreateRequest;
import com.junghee.javaerrorhandlerexample.module.post.request.PostRequest;
import com.junghee.javaerrorhandlerexample.module.post.response.PostInfoResponse;
import com.junghee.javaerrorhandlerexample.module.post.response.PostResponse;
import com.junghee.javaerrorhandlerexample.module.post.service.PostCreateService;
import com.junghee.javaerrorhandlerexample.module.post.service.PostSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostCreateService postCreateService;
    private final PostSearchService postSearchService;

    @PostMapping
    public ApiResponse<Void> createPost(@RequestBody PostCreateRequest request) {
        postCreateService.create(request);
        return ApiResponse.success();
    }

    @GetMapping
    public ApiResponse<PostInfoResponse> getPost(@RequestBody PostRequest request) {
        return ApiResponse.success(postSearchService.getPost(request));
    }

    @GetMapping("/list")
    public ApiResponse<PostResponse> getUserList() {
        return ApiResponse.success(postSearchService.getPostList());
    }

}
