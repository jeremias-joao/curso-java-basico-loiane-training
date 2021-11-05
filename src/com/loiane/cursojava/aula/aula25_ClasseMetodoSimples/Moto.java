package com.loiane.cursojava.aula.aula25_ClasseMetodoSimples;

public class Moto {

    String marca;
    String modelo;
    double preco;
    double comsumoGasolina;

     void calcularComsumoGasolina() {
       System.out.println("O valor será: " +preco * comsumoGasolina);
    }
}
