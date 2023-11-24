package com.ll.sbbmission;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Getter
@Setter
public class AnswerForm {
    @NotEmpty (message = "내용은 필수 항목 입니다.")
    private String content;


}
