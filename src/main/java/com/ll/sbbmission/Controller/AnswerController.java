package com.ll.sbbmission.Controller;

import com.ll.sbbmission.Entity.Question.Question;
import com.ll.sbbmission.Service.AnswerService;
import com.ll.sbbmission.Service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model , @PathVariable("id")
     Integer id , @RequestParam String content) {
        Question question = this.questionService.getQuestion(id);

        this.answerService.create(question , content);

        return "redirect:/question/detail/%s".formatted(id);
    }

}
