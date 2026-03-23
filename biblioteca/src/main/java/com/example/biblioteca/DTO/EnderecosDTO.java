package com.example.biblioteca.models;

import java.io.Serializable;
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
@Table(name = "Enderecos")
public class Enderecos implements Serializable{ // serializa a classe oara import regras de negocios web
  private static final long serialVersionUID = 1L; // versão da classe para controle de serialização
  @Id //identificador para o banco de dados
  @GeneratedValue (strategy = GenerationType.IDENTITY) // gera o ID automaticametne
  private long id;
  private String cep;
  private String bairro;
  private String rua;
  private String cidade;
  private String estado;
  private String numero;

  public EnderecosDTO( Enderecos entity){
    this.id = entity.getId();
    this.ceo = entity.getCep();
    this.bairro = entity.getBairro();
    this.rua = entity.getRua();
    this.cidade = entity.getCidade();
    this.estado = entity.getEstado();
    this.numero = entity.getNumero();
  }

}
