package com.microservices.service2.controller;


import com.microservices.service2.entites.Cours;
import com.microservices.service2.service.Cours_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Cours/api")
public class CoursController {
    @Autowired
    private Cours_Service svc2Service;

    @GetMapping("/getItems")
    public ResponseEntity<List<Cours>> getItems(){
        return new ResponseEntity<>( svc2Service.getICours(), HttpStatus.OK);

    }

}
