package com.loiane.cursojava.aula.aula26_ClasseMetodoRetorno;

public class Carro {

    String marca;
    String modelo;
    int numPassgageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia é: "+capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia(){
        System.out.println("Metodo obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
}
