package com.microservices.service2.service;

import com.microservices.service2.entites.Cours;
import com.microservices.service2.external.Student;


import java.util.List;

public interface Cours_Service {
    List<Student> getStudent();

    List<Cours> getICours();
}
