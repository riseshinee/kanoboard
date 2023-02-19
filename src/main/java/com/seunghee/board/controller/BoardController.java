package com.seunghee.board.controller;

import com.seunghee.board.model.Board;
import com.seunghee.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    
    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public List<Board> getBoards() {
        return boardService.getBoards();
    }

    @PostMapping
    public void insertBoard( Board board) {
        //log.info("insertBoard : {}", board);
        boardService.insertBoard(board);
    }

    @PatchMapping
    public void updateBoardById(Board board) {
        //log.info("updateBoard : {}", board);
        boardService.updateBoardById(board);
    }

    @DeleteMapping("/{id}")
    public void deleteBoardById(@PathVariable("id") int id) {
       // log.info("updateBoard : {}", board);
        boardService.deleteBoardById(id);
    }
    
}