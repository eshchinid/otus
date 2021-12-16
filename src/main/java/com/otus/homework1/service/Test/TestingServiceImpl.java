package com.otus.homework1.service.Test;


import com.otus.homework1.model.Person;
import com.otus.homework1.model.Question;
import com.otus.homework1.model.Testing;
import com.otus.homework1.service.IO.IOService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TestingServiceImpl implements TestingService {
    private final IOService ioService;

    public Testing createTest(Person person, List<Question> questions) {
        return new Testing(person, questions);
    }

    public void start(Testing testing) {
        ioService.write("");
        int currentQuestion = 0;
        for (Question question : testing.getQuestions()
        ) {
            currentQuestion++;
            ioService.write("Вопрос №" + currentQuestion + ": ");
            ioService.write(question.getQuestion());
            for (int i = 1; i <= question.getAnswers().size(); i++) {
                ioService.write("Ответ №" + i + ": " + question.getAnswers().get(i - 1));
            }
            ioService.write("");
        }

        ioService.write("Tecт окончен!");
        ioService.write("Тест проходил: " + testing.getPerson().getSecondName() + " " + testing.getPerson().getFirstName());
        ioService.write("Количество вопросов: " + testing.getQuestions().size());
    }
}
