package com.otus.homework1;


import com.otus.homework1.service.Execution.ExecutionService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        ExecutionService executionService = context.getBean(ExecutionService.class);
        executionService.start();
    }

}
