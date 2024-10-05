package com.mongodb.mongoDBProject.repository;

import com.mongodb.mongoDBProject.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Student, Integer> {

}
