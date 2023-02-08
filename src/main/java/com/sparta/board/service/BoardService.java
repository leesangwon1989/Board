package com.sparta.board.service;


import com.sparta.board.dto.BoardRequestDto;
import com.sparta.board.dto.BoardResponseDto;
import com.sparta.board.dto.PasswordDto;
import com.sparta.board.entity.Board;
import com.sparta.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public BoardResponseDto createBoard(BoardRequestDto requestDto) {
        Board board = new Board(requestDto);
        boardRepository.save(board);
        return new BoardResponseDto(board);
    }

    @Transactional(readOnly = true)
    public List<BoardResponseDto> getBoard() {
        List<Board> list = boardRepository.findAllByOrderByModifiedAtDesc();
        return list.stream()
                .map(BoardResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long update(Long id, BoardRequestDto requestDto) {
        Board board = findByValidateId(id);
        validatePassword(requestDto.getPassword(), board.getPassword());
        board.update(requestDto);
        return board.getId();
    }

    public BoardResponseDto getSelectedBoard(Long id) {
        Board board = findByValidateId(id);
        return new BoardResponseDto(board);
    }

    public Long deleteBoard(Long id, PasswordDto dto) {
        Board board = findByValidateId(id);
        validatePassword(dto.getPassword(), board.getPassword());
        boardRepository.deleteById(id);
        return board.getId();
    }

    private Board findByValidateId(Long id) {
        return boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
    }

    private static void validatePassword(String requestPassword, String boardPassword) {
        if (!boardPassword.equals(requestPassword)) {
            throw new IllegalStateException("비밀번호가 일치하지 않습니다.");
        }
    }
}
