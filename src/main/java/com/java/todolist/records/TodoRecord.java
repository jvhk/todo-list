package com.java.todolist.records;

import lombok.*;

public record TodoRecord(Long idTodo,String nome, String descricao, boolean realizado, int prioridade, Long idUsuario) {

    public TodoRecord(Long idTodo, String nome, String descricao, boolean realizado, int prioridade, Long idUsuario) {
        this.idTodo = idTodo;
        this.nome = nome;
        this.descricao = descricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
        this.idUsuario = idUsuario;
    }

    @Override
    public Long idTodo() {
        return idTodo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
