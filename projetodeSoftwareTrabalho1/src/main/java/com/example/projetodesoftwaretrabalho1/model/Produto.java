package com.example.projetodesoftwaretrabalho1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String imagem;

    public Produto(String imagem, int quantidade, String nome, String descricao, double preco) {
        this.imagem = imagem;
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
    }

    public Produto(int id, String imagem, int quantidade, String descricao, String nome, double preco) {
        this.id = id;
        this.imagem = imagem;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getImagem() {
        return imagem;
    }

    @Override
    public String toString() {
        return "Produto{" +

                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", imagem= '" + imagem + '\'' +
                '}';
    }
}
