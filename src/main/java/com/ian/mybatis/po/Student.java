package com.ian.mybatis.po;

import java.util.List;

public class Student {

    protected int id;
    protected String name;
    protected Sex sex;
    protected StudentSelfcard selfCard;
    protected List<StudentLecture> studentLectures;
    protected String note;

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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public StudentSelfcard getSelfCard() {
        return selfCard;
    }

    public void setSelfCard(StudentSelfcard selfCard) {
        this.selfCard = selfCard;
    }

    public List<StudentLecture> getStudentLectures() {
        return studentLectures;
    }

    public void setStudentLectures(List<StudentLecture> studentLectures) {
        this.studentLectures = studentLectures;
    }
}
