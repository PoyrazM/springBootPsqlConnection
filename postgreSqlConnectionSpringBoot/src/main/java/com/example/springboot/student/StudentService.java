package com.example.springboot.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<Student> getStudents(){
        return this.repository.findAll();
    }

    public void addNewStudent(Student student){
        System.out.println(student);
    }
}
