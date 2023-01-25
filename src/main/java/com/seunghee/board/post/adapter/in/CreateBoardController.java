package com.seunghee.board.post.adapter.in;
package com.seunghee.board.post.domain.Board;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seunghee.board.post.application.port.in.CreateBoardUseCase;
import com.seunghee.board.post.application.port.in.CreateBoardCommand;

@RestController
public class CreateBoardController {
    private CreateBoardUseCase createBoardUseCase;

    @PostMapping("/post/create")
    public String createBoard(){

        String user_id = "1";
        String title = "test";
        String content = "test";
        
        CreateBoardCommand command = new CreateBoardCommand(
            user_id,
            title,
            content
        );

        createBoardUseCase.createBoard(command);

        return "sucess";

    }





    
}
