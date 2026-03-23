package com.example.biblioteca.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Livros")
public class Livros implements Serializable{ // serializa a classe oara import regras de negocios web
  private static final long serialVersionUID = 1L; // versão da classe para controle de serialização
  @Id //identificador para o banco de dados
  @GeneratedValue (strategy = GenerationType.IDENTITY) // gera o ID automaticametne
  private long id;
  private String titulo;
  private String autor;
  private String genero;
  private LocalDateTime insert;
  private LocalDate publicacao;

  public UserDTO( User entity){
    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.autor = entity.getAutor();
    this.genero = entity.getGenero();
    this.insert = entity.getInsert();
    this.publicacao = entity.getPublicacao();
  }
}
