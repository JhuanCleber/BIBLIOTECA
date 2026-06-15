package com.example.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca.models.Enderecos;

@Repository //anotação de repositório para indicar que esta interface é um componente de acesso a dados

public interface EnderecosRepository //nome da classe seguindo a convenção de nomenclatura para repositórios
extends JpaRepository //usamos a extensão JpaRepository para fornecer métodos de acesso a dados pré-definidos, como salvar, encontrar, atualizar e excluir entidades

<Enderecos, Long> { // colocamos o nosso modelo de dados (User) e o tipo do ID (Long) para que o Spring Data JPA possa gerar a implementação correta dos métodos de acesso a dados

}
