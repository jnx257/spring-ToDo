package com.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.domain.TodoItem;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
//https://localhost:3030
//indicativo de RestAPI tools, retornando objetos...
public class TodoController {
    
    
    @Autowired
    private TodoService todoService;
    

    @GetMapping("/api/todoItems")
    //manda dados para nossa aplicacao (responseEntity)
    public ResponseEntity<?> fetchAllTodoItens(){
        List<TodoItem> todoItems = todoService.fetchAllTodoItems();
        
        return ResponseEntity.ok(todoItems);
    }
}
