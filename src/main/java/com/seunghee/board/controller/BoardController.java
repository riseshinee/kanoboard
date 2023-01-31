package com.seunghee.board.controller;

import com.seunghee.board.model.Board;
import com.seunghee.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @ResponseBody
    public List<Board> findBoards() {
        return boardService.findBoards();
    }

    @PostMapping("/create")
    @ResponseBody
    public void insertBoard( Board board) {
        //log.info("insertBoard : {}", board);
        boardService.insertBoard(board);
    }


    
    
}