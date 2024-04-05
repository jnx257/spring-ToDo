package com.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.domain.TodoItem;
import com.todo.repositopry.TodoRepository;

@Service
public class TodoService {
    @Autowired // inject
    private TodoRepository todoRepo;

    public List<TodoItem> fetchAllTodoItems(){
       return  todoRepo.fetchAllTodoItems();
    }

}
