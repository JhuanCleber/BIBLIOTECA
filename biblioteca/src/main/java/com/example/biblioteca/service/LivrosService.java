package com.example.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.DTO.LivrosDTO;
import com.example.biblioteca.models.Livros;
import com.example.biblioteca.repository.LivrosRepository;

@Service
public class LivrosService {
  @Autowired
  private LivrosRepository repositorylivros;

  public List<Livros> Listar() {
    List<Livros> livros = repositorylivros.findAll();
    return livros;
  }

  public LivrosDTO insert(LivrosDTO dto) {
    Livros entidade = new Livros();
    entidade.setTitulo(dto.getTitulo());
    entidade.setGenero(dto.getGenero());
    entidade.setInsert(dto.getInsert());
    entidade.setPublicacao(dto.getPublicacao());

    return new LivrosDTO(entidade);
  }
}
