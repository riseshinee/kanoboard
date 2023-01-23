package com.seunghee.board.post.adapter.out;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardEntity {
    private Integer id;
    private String user_id;
    private String title;
    private String content;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;
}

