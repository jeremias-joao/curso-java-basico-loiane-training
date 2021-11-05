package com.loiane.cursojava.aula.aula24_ClasseObjectoAtributos;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassgageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassgageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;


        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);


    }
}
