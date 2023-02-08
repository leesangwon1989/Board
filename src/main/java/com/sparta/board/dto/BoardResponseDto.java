package com.sparta.board.dto;


import com.sparta.board.entity.Board;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardResponseDto {

    private final String title;
    private final String userName;
    private final String contents;
    private final LocalDateTime createdAt;

    public BoardResponseDto(Board board) {
        this.title = board.getTitle();
        this.userName = board.getUsername();
        this.contents = board.getContents();
        this.createdAt = board.getCreatedAt();
    }
}
