package com.junghee.javaerrorhandlerexample.module.post.response;

import java.util.List;
import lombok.Builder;

@Builder
public record PostResponse(
    List<PostInfoResponse> posts
) {

    public static PostResponse toResponse(List<PostInfoResponse> posts) {
        return PostResponse.builder()
            .posts(posts)
            .build();
    }

}
