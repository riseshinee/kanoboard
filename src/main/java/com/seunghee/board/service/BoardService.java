package com.seunghee.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seunghee.board.model.Board;
import com.seunghee.board.mapper.BoardMapper;

import java.util.List;


@Service
public class BoardService {
    
    public BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> findBoards() {
        return boardMapper.findBoards();
    }

    public void insertBoard(Board board) {
       boardMapper.insertBoard(board);
    }
    
}
