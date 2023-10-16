package com.java.todolist.services;

import com.java.todolist.entities.Todo;
import com.java.todolist.entities.Usuario;
import com.java.todolist.records.TodoRecord;
import com.java.todolist.repository.TodoRepository;
import com.java.todolist.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public Todo criarTodo(TodoRecord todoRecord) {
        Todo todo = new Todo();
        Usuario usuario = usuarioRepository.findById(todoRecord.getIdUsuario()).get();
//        if(usuario.isPresent()) {
            todo.setUsuario(usuario);
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario nao encontrado!");
//        }
        todo.setDescricao(todoRecord.getDescricao());
        todo.setNome(todoRecord.getNome());
        todo.setRealizado(todoRecord.isRealizado());
        todo.setPrioridade(todoRecord.getPrioridade());
        return todoRepository.save(todo);
    }

    public List<Todo> listarTodos(){
        return todoRepository.findAll();
    }
}
