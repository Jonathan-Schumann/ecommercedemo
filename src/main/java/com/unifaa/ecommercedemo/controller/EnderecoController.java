package com.unifaa.ecommercedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifaa.ecommercedemo.model.Endereco;
import com.unifaa.ecommercedemo.service.EnderecoService;

@RestController
@RequestMapping("/api/enderecos")
@CrossOrigin("*")
public class EnderecoController  {

    @Autowired
    private EnderecoService enderecoService;
    
    @GetMapping
    public List<Endereco> obterTodos(){

        return enderecoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Endereco obterPorId(@PathVariable long id){

        return enderecoService.obterPorId(id);
    }

    @PostMapping
    public Endereco adicionar(@RequestBody Endereco endereco){
        return enderecoService.adicionar(endereco);

    }
    
    
    @PutMapping("/{id}")
    public Endereco atualizar(@PathVariable Long id, @RequestBody Endereco endereco){
        return enderecoService.atualizar(id, endereco);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        enderecoService.deletar(id);
    }
}

