package com.mongodb.mongoDBProject.controller;

import com.mongodb.mongoDBProject.model.Student;
import com.mongodb.mongoDBProject.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private Repository repository;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student) {
        repository.save(student);
        return "Successfully saved student";
    }
    @PutMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student) {
        repository.save(student);
        return "Successfully updated student";
    }
        @GetMapping("/getAllStudents")
        public List<Student> getAllStudents () {
            return repository.findAll();

        }


}
