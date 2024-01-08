package com.microservices.service1.controller;

import com.microservices.service1.entity.Student;
import com.microservices.service1.model.StudentRequest;
import com.microservices.service1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student/api")
public class StudentController {
    @Autowired
    private StudentService svc1Service;
    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Hello from service 1", HttpStatus.OK);
    }
    @PostMapping("/addItem")
    public ResponseEntity<String> addItem(@RequestBody StudentRequest studentRequest) {
        svc1Service.saveItem(studentRequest);
        return new ResponseEntity<>("Item saved successfully", HttpStatus.OK);
    }
    @GetMapping("/getItems")
    public ResponseEntity<List<Student>> getItems() {
        List<Student> items =svc1Service.getStudent();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
