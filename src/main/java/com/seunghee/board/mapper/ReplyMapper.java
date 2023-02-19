package com.seunghee.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.seunghee.board.model.Reply;

@Mapper
@Repository
public interface ReplyMapper {
    @Select("SELECT * FROM reply WHERE board_id = #{board_id}")
    public List<Reply> getReplyByBoardId(Long board_id);

    @Select("SELECT * FROM reply WHERE id = #{id}")
    public Reply getReplyById(Long id);

	@Insert("INSERT INTO reply (reply_id, board_id, user_id, content) values (#{reply_id}, #{board_id}, #{user_id}, #{content})")
    public void insertReply(Reply reply);

    @Update("UPDATE reply SET content = #{content} WHERE id = #{id}")
    public void updateReplyById(Reply reply);

    @Delete("DELETE FROM reply WHERE id = #{id}")
    public void deleteReplyById(int id);


    

}
