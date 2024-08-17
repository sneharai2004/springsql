package com.example.sneha.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sneha.model.Student;
import com.example.sneha.repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    StudentRepository repo;
    public List<Student>getStudent(){
        return repo.findAll();
    }
    public Student kpt(Student stud){
        return repo.save(stud);
    } 
    public void deleteSytudent(int id ){
        repo.deleteById(id);
    }  
}