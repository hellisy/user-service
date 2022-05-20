package com.org.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Twitter {

    private Long tweetId;
    private String tweetName;
    private String postdate;
    private String content;
}
