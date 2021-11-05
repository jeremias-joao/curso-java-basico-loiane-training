package com.loiane.cursojava.aula.aula32_MetodosGetterSetter;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.setMarca("Fiat");
        van.setModelo("QTD-8");
        van.setNumPassageiros(4);
        van.setCapCombustivel(2.50);
        van.setConsumoCombustivel(10.50);


        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
        System.out.println(van.getNumPassageiros());
        System.out.println(van.getCapCombustivel());
        System.out.println(van.getConsumoCombustivel());

















    }
}
