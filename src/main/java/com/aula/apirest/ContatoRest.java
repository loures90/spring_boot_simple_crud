package com.aula.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.apirest.database.RepositorioContato;
import com.aula.apirest.entidade.Contato;

@RestController
@RequestMapping("/contato")
public class ContatoRest {
  @Autowired
  private RepositorioContato repositorioContato;

  @GetMapping
  public List<Contato> list() {
    return repositorioContato.findAll();
  }

  @PostMapping
  public void salvar(@RequestBody Contato contato) {
    repositorioContato.save(contato);
  }

  @PutMapping
  public void update(@RequestBody Contato contato) {
    if(contato.getId() != null)
      repositorioContato.save(contato);
  }

  @DeleteMapping
  public void delete(@RequestBody Contato contato) {
    repositorioContato.delete(contato);
  }
}
