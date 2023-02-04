package com.seunghee.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.seunghee.board.model.Reply;

@Mapper
@Repository
public interface ReplyMapper {
    @Select("SELECT * FROM reply WHERE board_id = #{board_id}")
    public List<Reply> getReplyByBoardId();

	@Insert("INSERT INTO reply (reply_id, board_id, user_id, content) values (#{reply_id}, #{board_id}, #{user_id}, #{content})")
    public void insertReply(Reply reply);
}
