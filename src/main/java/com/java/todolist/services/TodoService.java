package com.java.todolist.services;

import com.java.todolist.entities.Todo;
import com.java.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public Todo criarTodo(String nome, String descricao, boolean realizado, int prioridade){
        Todo todo = new Todo();
        todo.setDescricao(descricao);
        todo.setNome(nome);
        todo.setRealizado(realizado);
        todo.setPrioridade(prioridade);

        return todoRepository.save(todo);
    }

    public List<Todo> listarTodos(){
        return todoRepository.findAll();
    }
}
