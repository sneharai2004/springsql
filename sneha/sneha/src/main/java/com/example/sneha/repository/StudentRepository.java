package com.example.sneha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sneha.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
