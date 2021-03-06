package com.courses.hibernate.dao.impl;


import com.courses.hibernate.dao.interfaces.SubjectDao;
import com.courses.hibernate.model.Subject;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("subjectDao")
@Transactional
public class SubjectDaoImpl implements SubjectDao {

    @Autowired
    private SessionFactory sessionFactory;


    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public Subject getSubjectById(int id) {
        return (Subject)getSession().load(Subject.class, new Integer(id));
    }

    public List<Subject> getAllSudject() {
        Criteria criteria = getSession().createCriteria(Subject.class);
        return (List<Subject>) criteria.list();
    }

    public void insertSubject(Subject subject) {
        getSession().save(subject);
    }

    public void insertListSubject(List<Subject> subjects) {
        for(Subject subject: subjects){
            insertSubject(subject);
        }
    }

    public void delateSubject(int id) {
        getSession().delete(getSession().load(Subject.class, new Integer(id)));
    }

    public void delateSubject(Subject subject) {
        getSession().delete(subject);
    }

    public void updateSubject(Subject subject) {
        getSession().update(subject);
    }
}
