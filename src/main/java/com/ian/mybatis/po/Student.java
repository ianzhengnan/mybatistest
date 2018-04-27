package com.ian.mybatis.po;

public class Student {

    private int id;
    private String name;
    private Sex sex;
    private int selfCardNo;
    private String note;

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

    public int getSelfCardno() {
        return selfCardNo;
    }

    public void setSelfCardno(int selfCardno) {
        this.selfCardNo = selfCardno;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
