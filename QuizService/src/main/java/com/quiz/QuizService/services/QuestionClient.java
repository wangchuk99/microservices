package com.quiz.QuizService.services;

import com.quiz.QuizService.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8082", value = "Question-Client")
public interface QuestionClient {

    @GetMapping("/question/list")
    Question getQuestions();

}
