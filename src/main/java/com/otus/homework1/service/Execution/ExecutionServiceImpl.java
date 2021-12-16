package com.otus.homework1.service.Execution;

import com.otus.homework1.model.Person;
import com.otus.homework1.model.Question;
import com.otus.homework1.model.Testing;
import com.otus.homework1.service.IO.IOService;
import com.otus.homework1.service.Person.PersonService;
import com.otus.homework1.service.Question.QuestionService;
import com.otus.homework1.service.Test.TestingService;
import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class ExecutionServiceImpl implements ExecutionService {

    private final PersonService personService;
    private final QuestionService questionService;
    private final TestingService testingService;
    private final IOService ioService;

    public void start() {
        ioService.write("Введите имя");
        String firstName = ioService.read();
        ioService.write("Введите фамилию");
        String secondName = ioService.read();

        Person person = personService.get(firstName, secondName);
        List<Question> questions = questionService.getQuestions();
        Testing testing = testingService.createTest(person,questions);
        testingService.start(testing);
    }
}
