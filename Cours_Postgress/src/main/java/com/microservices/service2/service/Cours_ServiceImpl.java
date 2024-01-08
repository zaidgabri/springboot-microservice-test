package com.microservices.service2.service;


import com.microservices.service2.entites.Cours;
import com.microservices.service2.external.Cours_Client;
import com.microservices.service2.external.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cours_ServiceImpl  implements  Cours_Service{
    @Autowired
    private Cours_Client svc1Client;



    @Override
    public List<Student> getStudent() {
        ResponseEntity<List<Student>> response = svc1Client.getStudent();
        List<Student> students = response.getBody();
        return students;
    }

    @Override
    public List<Cours> getICours() {
        return null;
    }
}
