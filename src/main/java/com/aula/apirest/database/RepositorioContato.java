package com.aula.apirest.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.apirest.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato, Long>{
  
}