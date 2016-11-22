package com.courses.hibernate.dao.impls;


import com.courses.hibernate.dao.interfaces.SubjectDao;
import com.courses.hibernate.models.Subject;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class SubjectDaoImpl implements SubjectDao {

    private Session session;

    public SubjectDaoImpl(Session session) {
        this.session = session;
    }

    public Subject getSubjectById(int id) {
        return (Subject)session.load(Subject.class, new Integer(id));
    }

    public List<Subject> getAllSudject() {
        Query query = session.createQuery("FROM Subject");
        return query.list();
    }

    public void insertSubject(Subject subject) {
        session.save(subject);
    }

    public void insertListSubject(List<Subject> subjects) {
        for(Subject subject: subjects){
            insertSubject(subject);
        }
    }

    public void delateSubject(int id) {
        session.delete(session.load(Subject.class, new Integer(id)));
    }

    public void delateSubject(Subject subject) {
        session.delete(subject);
    }

    public void updateSubject(Subject subject) {
        session.update(subject);
    }
}
