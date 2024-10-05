package com.mongodb.mongoDBProject.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document("std11")
public class Student {

    private String _id;

    private Integer studentId;
    private String studentname;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
}
