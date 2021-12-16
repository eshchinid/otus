package com.otus.homework1.service.Question;

import com.otus.homework1.model.Question;

import java.util.List;

/**
 * The interface Question service.
 */
public interface QuestionService {

    /**
     * Gets questions.
     *
     * @return the questions
     */
    List<Question> getQuestions();
}
