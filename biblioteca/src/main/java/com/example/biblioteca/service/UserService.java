package com.example.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.DTO.UserDTO;
import com.example.biblioteca.models.User;
import com.example.biblioteca.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository repositoryUser;

 
  public List<User> Listar() {
    List<User> users = repositoryUser.findAll();
    return users;
  }


  public UserDTO insert(UserDTO dto) {
    User entidade = new User();
    entidade.setNome(dto.getNome());
    entidade.setEmail(dto.getEmail());
    entidade.setSenha(dto.getSenha());
    entidade.setTelefone(dto.getTelefone());
    entidade.setCpf(dto.getCpf());    
    entidade.setEndereco(1);
    entidade = repositoryUser.save(entidade);
    return new UserDTO(entidade);
  }


}
