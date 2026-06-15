package com.example.biblioteca.DTO;

import com.example.biblioteca.models.Autor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {
  private long id;
  private String nome;

  public AutorDTO(Autor entity){
    this.id = entity.getId();
    this.nome = entity.getNome();
  }
}