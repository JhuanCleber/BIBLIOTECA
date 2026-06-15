package com.example.biblioteca.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.biblioteca.models.Autor;
import com.example.biblioteca.models.Livros;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivrosDTO implements Serializable{ // serializa a classe oara import regras de negocios web
  private static final long serialVersionUID = 1L; // versão da classe para controle de serialização
  @Id //identificador para o banco de dados
  @GeneratedValue (strategy = GenerationType.IDENTITY) // gera o ID automaticametne
  private long id; 
  private String titulo;
  private String genero;
  private LocalDateTime insert;
  private LocalDate publicacao;
  private List<Long> autorIds; // Lista de IDs dos autores associados ao livro

  public LivrosDTO(Livros entity){
    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.genero = entity.getGenero();
    this.insert = entity.getInsert();
    this.publicacao = entity.getPublicacao();
    this.autorIds = entity.getAutores()
    .stream()
    .map(Autor::getId)
    .toList();

}
}
