package com.seunghee.board.controller;

import com.seunghee.board.model.Board;
import com.seunghee.board.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    /*
    @RequestMapping
    public ModelAndView getAll(Board board) {
        List<Board> countryList = boardService.getAll(board);
        return new PageInfo<Board>(boardList);
    }
    */
    
}