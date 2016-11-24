package com.courses.hibernate.main;


import com.courses.hibernate.configuration.Appconfiguration;
import com.courses.hibernate.dao.interfaces.SubjectDao;
import com.courses.hibernate.model.Subject;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Appconfiguration.class);

        SubjectDao subjectDao = (SubjectDao) context.getBean("subjectDao");






    }
}
