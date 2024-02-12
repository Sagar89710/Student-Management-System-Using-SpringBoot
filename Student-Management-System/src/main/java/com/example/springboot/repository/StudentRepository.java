package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
