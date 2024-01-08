package com.microservices.service1.service;


import com.microservices.service1.entity.Student;
import com.microservices.service1.model.StudentRequest;
import com.microservices.service1.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{
    @Autowired
    Student_Repository svc1Repository;
    @Override
    public void saveStudent(StudentRequest studentRequest) {
        Student name= Student.builder().name(studentRequest.getName()).build();
        svc1Repository.save(name);


    }

    @Override
    public List<Student> getStudent() {
        return  svc1Repository.findAll();

    }
}
