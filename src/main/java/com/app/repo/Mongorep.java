package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Employee;

public interface Mongorep  extends MongoRepository<Employee, String>{

}
