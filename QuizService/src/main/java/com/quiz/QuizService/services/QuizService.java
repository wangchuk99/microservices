package com.quiz.QuizService.services;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuizService {

    private QuizRepository quizRepository;

    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    public Quiz create(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}
