package com.microservices.service1.service;


import com.microservices.service1.entity.Student;

import com.microservices.service1.model.StudentRequest;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentRequest studentRequestRequest);

    List<Student> getStudent();
}
