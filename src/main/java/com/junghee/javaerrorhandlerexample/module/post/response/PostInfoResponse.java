package com.junghee.javaerrorhandlerexample.module.post.response;

import com.junghee.javaerrorhandlerexample.module.post.domain.Post;
import lombok.Builder;

@Builder
public record PostInfoResponse(
    Long id,
    String title,
    String content
) {

    public static PostInfoResponse toResponse(Post user) {
        return PostInfoResponse.builder()
            .id(user.getId())
            .title(user.getTitle())
            .content(user.getContent())
            .build();
    }

}
