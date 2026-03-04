package br.com.sararomao.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//camada reponsavel para fazer requisição a api com metodos get...
// o resquestmapping defne o path
@RestController
@RequestMapping("/api")
public class todoController {
   
  @GetMapping("/")
  public String getMethodName() {
      return "funcionou";
  }
  
 
  
}
