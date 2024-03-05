package com.question.QuestionService.controllers;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    @PostMapping("/create")
    public Question create(
            @RequestBody Question quiz
    ) {
        return questionService.create(quiz);
    }

    @GetMapping("/list")
    public List<Question> get() {
        return questionService.get();
    }
}
