package com.mongodb.mongoDBProject.controller;

import com.mongodb.mongoDBProject.model.Student;
import com.mongodb.mongoDBProject.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private Repository repository;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student) {

        repository.save(student);

        return "Successfully saved student";
    }
}
