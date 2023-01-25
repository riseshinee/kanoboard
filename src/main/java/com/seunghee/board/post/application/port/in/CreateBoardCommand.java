package com.seunghee.board.post.application.port.in;

import java.io.Serializable;
import java.security.PrivilegedAction;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)

public class CreateBoardCommand implements Serializable {

    private String user_id;
    private String title;
    private String content;

}
