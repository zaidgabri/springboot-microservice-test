package com.microservices.service2.external;

import com.microservices.service2.entites.Cours;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Student
{
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String phone;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cours> Cours;

}
