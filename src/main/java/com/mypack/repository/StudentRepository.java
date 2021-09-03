package com.mypack.repository;

import org.springframework.data.repository.CrudRepository;

import com.mypack.model.Student;
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
