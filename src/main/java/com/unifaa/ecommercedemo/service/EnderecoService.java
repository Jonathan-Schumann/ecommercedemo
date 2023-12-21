package com.unifaa.ecommercedemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifaa.ecommercedemo.model.Endereco;
import com.unifaa.ecommercedemo.repository.EnderecoRepository;

@Service
public class EnderecoService  {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco adicionar(Endereco endereco){

        return enderecoRepository.save(endereco);
    }

    public List<Endereco> obterTodos(){
        return enderecoRepository.findAll();
    }
    
    public Endereco obterPorId(Long id){
        Optional<Endereco> optEndereco = enderecoRepository.findById(id);

        if(optEndereco.isEmpty()){
            throw new IllegalArgumentException("Não existe um endereco com o ID " + id);
        }

        return optEndereco.get();
    }

    public Endereco atualizar(long id, Endereco endereco){

        endereco.setId(id);
        return enderecoRepository.save(endereco);
    }

    public void deletar(long id){
        enderecoRepository.deleteById(id);
    }

}
