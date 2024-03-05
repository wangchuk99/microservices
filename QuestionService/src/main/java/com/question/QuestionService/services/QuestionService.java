package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repositories.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionService {

    private QuestionRepository questionRepository;

    public List<Question> get() {
        return questionRepository.findAll();
    }

    public Question create(Question quiz) {
        return questionRepository.save(quiz);
    }
}
