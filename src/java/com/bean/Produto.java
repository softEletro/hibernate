/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bcustodio
 */
public class Produto {
    String nome;
    Double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public List incluirCarrinho(List carrinho) {
        carrinho = new ArrayList();
        
        return carrinho;
    }
}
