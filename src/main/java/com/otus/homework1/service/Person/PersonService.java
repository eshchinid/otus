package com.otus.homework1.service.Person;


import com.otus.homework1.model.Person;

/**
 * The interface Person service.
 */
public interface PersonService {
    /**
     * Get person.
     *
     * @param firstName  the first name
     * @param secondname the secondname
     * @return the person
     */
    Person get(String firstName, String secondname);
}
