package com.loiane.cursojava.aula.aula25_ClasseMetodoSimples;

public class Carro {

    String marca;
    String modelo;
    int numPassgageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){

        System.out.println("A autonomia �: "+capCombustivel *
                consumoCombustivel + " km");

    }

}
