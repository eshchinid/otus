package com.otus.homework1.dao;

import com.otus.homework1.model.Question;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionDaoImpl implements QuestionDao {
    final private String filename;
    private static final int QUESTION_INDEX=0;
    private static final int ANSWER_INDEX=5;

    public QuestionDaoImpl(String filename) {
        this.filename = filename;
    }

    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ResourceUtils.getFile("classpath:" + filename)), StandardCharsets.UTF_8));
            String line;
            Scanner scanner;
            int index = 0;

            while ((line = reader.readLine()) != null) {
                Question question = new Question();
                ArrayList<String> answers = new ArrayList<>();

                scanner = new Scanner(line);
                scanner.useDelimiter(";");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == QUESTION_INDEX) {
                        question.setQuestion(data);
                    } else if ((index > QUESTION_INDEX) && (index < ANSWER_INDEX)) {
                        answers.add(data);
                    } else throw new Error("Неправильный формат данных СSV файла");
                    index++;
                }
                index = 0;
                question.setAnswers(answers);
                questions.add(question);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return questions;
    }

}
