package com.seunghee.board.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Board{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Setter
    private int id;

    @Getter @Setter
    private String user_id;

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String content;

    @Setter
    private LocalDateTime createdAt;

    @Setter
    private LocalDateTime  updatedAt;

    @Setter
    private LocalDateTime  deletedAt;

}
