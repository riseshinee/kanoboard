package com.seunghee.board.mapper;



import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.seunghee.board.model.Board;



@Mapper
@Repository
public interface BoardMapper {
    @Select("SELECT * FROM board WHERE deletedAt IS NULL")
    public List<Board> getBoards();

	@Insert("INSERT INTO board (user_id, title, content) VALUES (#{user_id}, #{title}, #{content})")
    public void insertBoard(Board board);

    @Update("UPDATE board SET title = #{title}, content = #{content} WHERE id = #{id}")
    public void updateBoardById(Board board);

    @Update("UPDATE board SET deletedAt = #{deletedAt} WHERE id = #{id}")
    public void deleteBoardById(int id, String  deletedAt);

    @Select("SELECT * FROM board WHERE user_id = #{user_id}")
    public List<Board> getBoardsByUserId(String user_id);

    @Select("SELECT * FROM board WHERE id = ${id}")
    public Board getBoardById(int id);
}
