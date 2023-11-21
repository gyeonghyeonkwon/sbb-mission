package com.ll.sbbmission.Entity.Question;

import com.ll.sbbmission.Entity.Answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column (length = 200)
    private String subject;

    private LocalDateTime createDate;

    @OneToMany (mappedBy = "question" , cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
