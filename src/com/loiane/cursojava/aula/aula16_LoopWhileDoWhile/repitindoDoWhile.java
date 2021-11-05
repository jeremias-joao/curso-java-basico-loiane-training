package com.loiane.cursojava.aula.aula16_LoopWhileDoWhile;

public class repitindoDoWhile {

    public static void main(String[] args) {

        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contacto até " + max);

        while (i < max){
            System.out.println("Valor de i: "+i);
            i++; // i = i +1; ou i += 1;
        }

        do {
            i++;
            System.out.println("valor de i : " +i);
        } while (i < 13);
            System.out.println(i);
        }

    }
