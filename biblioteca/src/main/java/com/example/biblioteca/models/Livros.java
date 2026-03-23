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
 
  @Column(nullable = false) // não permite valor nulo
  private String titulo;

  @Column(nullable = false) // não permite valor nulo e garante que o email seja único
  private String autor;

  @Column(nullable = false) // não permite valor nulo
  private String genero;
  
  @Column(nullable = false) // não permite valor nulo
  private LocalDateTime insert;

  @Column(nullable = false)
  private LocalDate publicacao;


}
