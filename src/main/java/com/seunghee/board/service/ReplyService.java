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

    //게시판 기준으로 댓글 가져오기
    public List<Reply> getReplyByBoardId (Long board_id ) {
        return replyMapper.getReplyByBoardId(board_id);
    }

    //댓글 가져오기
    public Reply getReplyById (Long id ) {
        return (Reply) replyMapper.getReplyById(id);
    }

    //댓글, 대댓글 생성 (대댓글은 depth 1까지만 허용)
    public void insertReply(Reply reply) {
        
        if( reply.reply_id != null){
            Reply result = new Reply();
            result =  replyMapper.getReplyById(reply.reply_id);

            //log.info("insertReply : {}", result);
            if( result.reply_id == null )
                replyMapper.insertReply(reply);
            //오류 리턴하기

        }
        else{
            replyMapper.insertReply(reply);
        }
    }

    public void updateReplyById(Reply reply){
        replyMapper.updateReplyById(reply);
    }

    public void deleteReplyById(int id){
        replyMapper.deleteReplyById(id);
    }
    //TODO : 내가 쓴 댓글 보기
    
}
