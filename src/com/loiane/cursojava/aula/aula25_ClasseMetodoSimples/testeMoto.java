package com.loiane.cursojava.aula.aula25_ClasseMetodoSimples;

public class testeMoto {
    public static void main(String[] args) {

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "R7";
        moto.preco = 3.500;
        moto.comsumoGasolina = 2.50;


        moto.calcularComsumoGasolina();

        System.out.println(moto.marca);
        System.out.println(moto.modelo);



    }
}
