package com.seunghee.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seunghee.board.model.Reply;
import com.seunghee.board.mapper.ReplyMapper;

import java.util.List;

@Service
public class ReplyService {
    
    public ReplyMapper replyMapper;

    @Autowired
    public ReplyService(ReplyMapper replyMapper) {
        this.replyMapper = replyMapper;
    }

    public List<Reply> getReplyByBoardId (Long board_id ) {
        return replyMapper.getReplyByBoardId(board_id);
    }

    public void insertReply(Reply reply) {
       replyMapper.insertReply(reply);
    }
    
}
