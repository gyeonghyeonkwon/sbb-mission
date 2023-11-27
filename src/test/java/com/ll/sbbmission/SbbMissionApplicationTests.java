package com.ll.sbbmission;

import com.ll.sbbmission.Repository.QuestionRepository;
import com.ll.sbbmission.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbMissionApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for(int i =0; i <=300; i++) {

            String subject = "테스트 데이터입니다 :[%03d]" .formatted(i);

            String content = "내용 무";
            this.questionService.create(subject , content);
        }
    }
}
