package com.example.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.DTO.AutorDTO;
import com.example.biblioteca.models.Autor;
import com.example.biblioteca.service.AutorService;


@RestController //anotação de controlador para indicar que esta classe é um componente de controle de rotas e lógica de negócios relacionada a usuários
@RequestMapping("/autores") //mapeamento de rota para indicar que as rotas relacionadas a usuários começarão com "/users"
public class AutorController {
  @Autowired //anotação de injeção de dependência para indicar que o Spring deve injetar uma instância do UserService nesta classe
  private AutorService autorService; //declaração de uma variável do tipo UserService para

  @GetMapping("/listar") 
  public List<Autor>Listar(){
    return autorService.Listar(); 
  }

  @PostMapping("/cadastrar")
  public AutorDTO insert (@RequestBody AutorDTO dto){
    return autorService.insert(dto);
  }
    
}



