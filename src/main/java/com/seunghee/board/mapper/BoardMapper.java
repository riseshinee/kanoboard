package com.seunghee.board.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.seunghee.board.model.Board;



@Mapper
@Repository
public interface BoardMapper {
    @Select("SELECT * FROM board")
    public List<Board> findBoards();

	@Insert("INSERT INTO board (user_id, title, content) values (#{user_id}, #{title}, #{content})")
    public void insertBoard(Board board);
}
