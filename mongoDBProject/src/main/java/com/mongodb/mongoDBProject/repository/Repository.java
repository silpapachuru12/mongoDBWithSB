package com.mongodb.mongoDBProject.repository;

import com.mongodb.mongoDBProject.model.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.Optional;
import java.util.function.Function;

public interface Repository extends MongoRepository<Student, Integer> {

}
