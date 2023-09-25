package com.java.todolist.controllers;

import com.java.todolist.entities.Todo;
import com.java.todolist.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping(value = "/listar-todos")
    public ResponseEntity<List<Todo>> listarTodos(){
        return new ResponseEntity<>(todoService.listarTodos(), HttpStatus.OK);
    }
}
