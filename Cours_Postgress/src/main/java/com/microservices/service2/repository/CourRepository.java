package com.microservices.service2.repository;



import com.microservices.service2.entites.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourRepository extends JpaRepository<Cours,Long> {

}
