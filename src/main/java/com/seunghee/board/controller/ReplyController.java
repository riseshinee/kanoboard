package com.seunghee.board.controller;

import com.seunghee.board.model.Reply;
import com.seunghee.board.service.ReplyService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PostMapping
    public void insertReply(Reply reply) {
        replyService.insertReply(reply);
    }

    @PatchMapping
    public void updateReplyById(Reply reply) {
        replyService.updateReplyById(reply);
    }

    @DeleteMapping("/{id}")
    public void deleteReplyById(@PathVariable("id") int id) {
        replyService.deleteReplyById(id);
    }

    @GetMapping("/{userId}")
    public List<Reply> getReplyByUserId(@PathVariable("userId") String userId) {
        return replyService.getReplyByUserId(userId);
    }
    

    
    
}
