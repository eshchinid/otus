package com.otus.homework1.service.Person;

import com.otus.homework1.model.Person;

public class PersonServiceImpl implements PersonService {

    public Person get(String firstName, String secondName) {
        return new Person(firstName, secondName);
    }
}
