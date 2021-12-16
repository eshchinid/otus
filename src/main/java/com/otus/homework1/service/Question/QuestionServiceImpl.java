package com.otus.homework1.service.Question;

import com.otus.homework1.dao.QuestionDao;
import com.otus.homework1.model.Question;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionDao questionDao;

    public List<Question> getQuestions() {
        return questionDao.getQuestions();
    }

}
