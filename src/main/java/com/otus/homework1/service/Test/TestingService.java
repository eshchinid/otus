package com.otus.homework1.service.Test;


import com.otus.homework1.model.Person;
import com.otus.homework1.model.Question;
import com.otus.homework1.model.Testing;

import java.util.List;

/**
 * The interface Testing service.
 */
public interface TestingService {

    /**
     * Create test testing.
     *
     * @param person              the person
     * @param questionsByFileName the questions by file name
     * @return the testing
     */
    Testing createTest(Person person, List<Question> questionsByFileName);

    /**
     * Start.
     *
     * @param testing the testing
     */
    void start(Testing testing);
}
