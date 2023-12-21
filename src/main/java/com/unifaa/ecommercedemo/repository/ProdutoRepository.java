package com.unifaa.ecommercedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unifaa.ecommercedemo.model.Produto;
 

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    


    
}
