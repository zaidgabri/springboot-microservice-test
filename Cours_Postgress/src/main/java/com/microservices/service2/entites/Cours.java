package com.microservices.service2.entites;

import com.microservices.service2.external.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameCours;

    @ManyToMany(mappedBy = "cours", cascade = CascadeType.ALL)
    private List<Student> courses;


}
