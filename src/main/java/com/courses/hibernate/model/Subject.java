package com.courses.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name =("subject"))
public class Subject {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name=("ID"))
    private int id;

    @Column(name=("SUBJECT_NAME"))
    private String name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject(" + "id=" + id + ", name='" + name + '\'' +  ')';
    }
}
