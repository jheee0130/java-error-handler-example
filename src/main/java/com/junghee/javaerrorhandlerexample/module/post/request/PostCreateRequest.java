package com.junghee.javaerrorhandlerexample.module.post.request;

import com.junghee.javaerrorhandlerexample.global.constants.TimeZoneConstants;
import com.junghee.javaerrorhandlerexample.module.post.domain.Post;
import java.time.ZonedDateTime;

public record PostCreateRequest(
    Long id,
    String title,
    String content
) {

    public Post toEntity() {
        return Post.builder()
            .id(id)
            .title(title)
            .content(content)
            .createdAt(ZonedDateTime.now(TimeZoneConstants.UTC))
            .build();
    }

}
