package com.main.web.siwa.action.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WebsiteActionDto {
    private Long memberId;
    private String profileName;
    private Long websiteId;
    private String action;
    private Boolean isAdded;
    private Long likeCount;
    private Long dislikeCount;
    private Long bookmarkCount;
}
