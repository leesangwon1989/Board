package com.sparta.board.dto;


import com.sparta.board.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {
    private Long id;
    private String username;
    private String title;
    private String contents;
    private LocalDateTime modifiedAt;
    private LocalDateTime createdAt;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.username = board.getUsername();
        this.title = board.getTitle();
        this.contents = board.getContents();
        this.modifiedAt = board.getModifiedAt();
        this.createdAt = board.getCreatedAt();
    }
}