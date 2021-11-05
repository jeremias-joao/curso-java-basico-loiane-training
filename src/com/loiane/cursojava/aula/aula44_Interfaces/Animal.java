package com.loiane.cursojava.aula.aula44_Interfaces;

public abstract class Animal {

    private String nome;



    public abstract void emitirSoma();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
