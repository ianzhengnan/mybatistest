package com.ian.mybatis.po;

import java.util.List;

public class FemaleStudent extends Student {

    private List<StudentHealthFemale> studentHealthFemales;

    public List<StudentHealthFemale> getStudentHealthFemales() {
        return studentHealthFemales;
    }

    public void setStudentHealthFemales(List<StudentHealthFemale> studentHealthFemales) {
        this.studentHealthFemales = studentHealthFemales;
    }
}
