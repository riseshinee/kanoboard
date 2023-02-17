package com.seunghee.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seunghee.board.model.Reply;

import lombok.extern.slf4j.Slf4j;

import com.seunghee.board.mapper.ReplyMapper;

import java.util.List;
@Slf4j
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

    public Reply getReplyById (Long id ) {
        return (Reply) replyMapper.getReplyById(id);
    }

    public void insertReply(Reply reply) {
        
        if( reply.reply_id != null){
            Reply result = new Reply();
            result =  replyMapper.getReplyById(reply.reply_id);

            log.info("insertReply : {}", result);
            if( result.reply_id == null )
                replyMapper.insertReply(reply);

        }
        else{
    
            replyMapper.insertReply(reply);
        }
    }
    
}
