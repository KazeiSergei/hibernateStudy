package com.courses.hibernate.main;


import com.courses.hibernate.dao.impls.SubjectDaoImpl;
import com.courses.hibernate.dao.interfaces.SubjectDao;
import com.courses.hibernate.models.Subject;
import com.courses.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        SubjectDao subjectDao = new SubjectDaoImpl(session);

       /* Subject subject1 = new Subject();
        subject1.setName("pkmoenrf");
        subjectDao.insertSubject(subject1);*/
        System.out.println(subjectDao.getSubjectById(5));

        for(Subject subject:subjectDao.getAllSudject()){
            System.out.println(subject);
        }
        session.close();
        HibernateUtil.getSessionFactory().close();

    }
}
