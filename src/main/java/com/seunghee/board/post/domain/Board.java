package com.seunghee.board.post.domain;


import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Board {
    private Long id;
    private String user_id;
    private String title;
    private String content;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;

}