package com.demon.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.demon.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	

}
