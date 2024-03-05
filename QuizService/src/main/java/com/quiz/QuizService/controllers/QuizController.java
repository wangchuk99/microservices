package com.quiz.QuizService.controllers;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    @PostMapping("/create")
    public Quiz create(
            @RequestBody Quiz quiz
    ) {
        return quizService.create(quiz);
    }

    @GetMapping("/list")
    public List<Quiz> get() {
        return quizService.get();
    }
}
