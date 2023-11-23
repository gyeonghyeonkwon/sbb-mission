package com.ll.sbbmission.Service;

import com.ll.sbbmission.Entity.Answer.Answer;
import com.ll.sbbmission.Entity.Question.Question;
import com.ll.sbbmission.Repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question , String content) {

        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}
