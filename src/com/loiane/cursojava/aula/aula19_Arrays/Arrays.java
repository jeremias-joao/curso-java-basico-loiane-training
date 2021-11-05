package com.loiane.cursojava.aula.aula19_Arrays;

public class Arrays {
    public static void main(String[] args) {

        double tempDia001 = 31.13;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;

        double[] temperaturas = new double[365];

        temperaturas[0] = 31.13;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 3 �: " +temperaturas[2]);

        System.out.println("O tamanho de array: " + temperaturas.length);

        for(int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " e: " + temperaturas[i]);
        }
        for(double temp: temperaturas){
            System.out.println(temp);
        }

    }
}
