package com.seunghee.board.post.adapter.in;


import org.springframework.web.bind.annotation.PostMapping;
import com.seunghee.board.post.application.port.in.CreateBoardUseCase;
import com.seunghee.board.post.application.port.in.CreateBoardCommand;

public class CreateBoardController {
    private final CreateBoardUseCase createBoardUseCase;

    @PostMapping("/post/create")
    void createBoard(){

        String user_id = "1";
        String title = "test";
        String content = "test";
        
        CreateBoardCommand command = new CreateBoardCommand(
            user_id,
            title,
            content
        );

        createBoardUseCase.createBoard(command);

    }





    
}
