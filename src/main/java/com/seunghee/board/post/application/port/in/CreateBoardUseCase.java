package com.seunghee.board.post.application.port.in;

import com.seunghee.board.common.UseCase;
import com.seunghee.board.post.domain.Board;
import com.seunghee.board.post.adapter.out.BoardMapper;

import org.springframework.stereotype.Service;

import lombok.*;


@Service

public class CreateBoardUseCase implements UseCase<CreateBoardUseCase.CreateBoardInput, CreateBoardUseCase.CreatBoardOutput> {



	@Value
	public static class CreateBoardInput implements UseCase.InputValues {
		
	}

	@Getter
	@Setter
	@Builder
	public static class CreatBoardOutput implements UseCase.OutputValues {
		Integer id;
		//String serialNumber;
	}

}
