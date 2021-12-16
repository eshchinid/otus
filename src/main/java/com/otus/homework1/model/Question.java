package com.otus.homework1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    private String question;
    private ArrayList<String> answers;
    private int rightAnswer;
}
