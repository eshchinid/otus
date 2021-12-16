package com.otus.homework1.dao;



import com.otus.homework1.model.Question;

import java.util.List;

/**
 * The interface Question dao.
 */
public interface QuestionDao {
    /**
     * Gets questions.
     *
     * @return the questions
     */
    List<Question> getQuestions();
}
