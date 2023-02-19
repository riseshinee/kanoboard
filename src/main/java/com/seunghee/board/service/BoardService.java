package com.seunghee.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seunghee.board.model.Board;
import com.seunghee.board.mapper.BoardMapper;

import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;


@Service
public class BoardService {
    
    public BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    //
    public List<Board> getBoards() {
        return boardMapper.getBoards();
    }

    public void insertBoard(Board board) {
       boardMapper.insertBoard(board);
    }

    public void updateBoardById(Board board){
        boardMapper.updateBoardById(board);
    }

    public void deleteBoardById(int id){

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
 
        String deleteAt = dateFormat.format(date);
        boardMapper.deleteBoardById(id,  deleteAt);
    }

    //TODO: 내가 쓴 게시글 보기
    
}
