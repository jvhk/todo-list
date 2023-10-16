package com.java.todolist.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@SequenceGenerator(name = "seq_tb_todo", sequenceName = "seq_tb_todo", allocationSize = 1)
@Table(name = "tb_todo", schema = "todolist")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_tb_todo")
    @Column(name = "seq_todo")
    private Long id;

    @OneToOne(targetEntity = Usuario.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "seq_usuario")
    private Usuario usuario;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "realizado")
    private boolean realizado;

    @Column(name = "prioridade")
    private int prioridade;

}