package com.seunghee.board.controller;

import com.seunghee.board.model.Reply;
import com.seunghee.board.service.ReplyService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// @Slf4j
@RestController
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    
    @Autowired
    public ReplyController(ReplyService replyService) {
        this.replyService = replyService;
    }

    @GetMapping("/list")
    public List<Reply> getReplyByBoardId(@RequestParam Long board_id) {
        return replyService.getReplyByBoardId(board_id);
    }

    @PostMapping("/create")
    public void insertReply(Reply reply) {
        //log.info("insertBroard : {}", board);
        replyService.insertReply(reply);
    }
    
}
