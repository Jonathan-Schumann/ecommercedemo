package com.unifaa.ecommercedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unifaa.ecommercedemo.model.Cliente;
 

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    


    
}
