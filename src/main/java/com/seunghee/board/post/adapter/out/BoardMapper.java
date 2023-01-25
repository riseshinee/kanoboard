package com.seunghee.board.post.adapter.out;
import com.seunghee.board.post.domain.Board;
//import com.seunghee.board.post.application.port.in.CreateBoardUseCase;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    Board getBoard(int id);
    int createBoard( Board board);

}
