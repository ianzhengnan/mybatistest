package com.ian.mybatis.po;

import java.util.List;

public class MaleStudent extends Student {

    private List<StudentHealthMale> studentHealthMales;

    public List<StudentHealthMale> getStudentHealthMales() {
        return studentHealthMales;
    }

    public void setStudentHealthMales(List<StudentHealthMale> studentHealthMales) {
        this.studentHealthMales = studentHealthMales;
    }
}
