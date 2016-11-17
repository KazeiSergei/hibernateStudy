package com.courses.hibernate.main;


import com.courses.hibernate.models.Subject;
import com.courses.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Subject> subjectList;

        Query query = session.createQuery("FROM Subject");
        subjectList = query.list();

        for(Subject subject:subjectList){
            System.out.println(subject);
        }
        session.close();
        sessionFactory.close();
    }
}
