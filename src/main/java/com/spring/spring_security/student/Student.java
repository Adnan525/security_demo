package com.spring.spring_security.student;

public class Student {
    private final Integer studentID;
    private String studentName;

    public Student(Integer studentID) {
        this.studentID = studentID;
    }

    public Student(Integer studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
