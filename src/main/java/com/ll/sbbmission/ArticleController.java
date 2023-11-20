package com.ll.sbbmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/")
    public String write(Model model){
        model.addAttribute("nickname","권경현");

        return "layout/hello";
    }

}
