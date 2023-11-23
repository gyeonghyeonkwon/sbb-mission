package com.ll.sbbmission.Service;

import com.ll.sbbmission.DataNotFoundException;
import com.ll.sbbmission.Entity.Question.Question;
import com.ll.sbbmission.Repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {

        return this.questionRepository.findAll();
    }


    public Question getQuestion(Integer id) {

        Optional<Question> question = this.questionRepository.findById(id);

        if (question.isPresent()) {

            return question.get();
        } else {

            throw new DataNotFoundException("question not found");
        }

    }
}

