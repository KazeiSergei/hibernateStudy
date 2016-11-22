package com.courses.hibernate.dao.interfaces;


import com.courses.hibernate.models.Subject;

import java.util.List;

public interface SubjectDao {

    Subject getSubjectById(int id);
    List<Subject> getAllSudject();
    void insertSubject(Subject subject);
    void insertListSubject(List<Subject> subjects);
    void delateSubject(int id);
    void delateSubject(Subject subject);
    void updateSubject(Subject subject);
}
