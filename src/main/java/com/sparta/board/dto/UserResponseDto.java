package com.sparta.board.dto;


import com.sparta.board.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponseDto {
    private String username;
    private String password;

    public UserResponseDto(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
    }
}