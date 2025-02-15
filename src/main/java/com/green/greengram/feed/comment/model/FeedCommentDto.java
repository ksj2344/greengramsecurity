package com.green.greengram.feed.comment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

//Value Object
//DataTransferObject
@Getter
@Setter
public class FeedCommentDto {
    @JsonIgnore
    private long feedId;
    private String comment;
    private long feedCommentId;
    private long writerUserId;
    private String writerNm;
    private String writerPic;
}
