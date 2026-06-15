package com.example.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.DTO.AutorDTO;
import com.example.biblioteca.models.Autor;
import com.example.biblioteca.repository.AutorRepository;

@Service
public class AutorService {
  @Autowired
  private AutorRepository repositoryAutor;

  public List<Autor> Listar() {
    List<Autor> Autors = repositoryAutor.findAll();
    return Autors;
  }

  public AutorDTO insert(AutorDTO dto) {
    Autor entidade = new Autor();
    entidade.setNome(dto.getNome());
    entidade = repositoryAutor.save(entidade);
    return new AutorDTO(entidade);
  }

}
