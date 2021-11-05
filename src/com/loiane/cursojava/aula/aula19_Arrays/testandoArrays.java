package com.loiane.cursojava.aula.aula19_Arrays;

public class testandoArrays {

    public static void main(String[] args) {

        String[] nomes = new String[10];
        nomes[0] = "Jeremias";
        nomes[1] = "João";
        nomes[2] = "Sila";
        nomes[3] = "Daniel";
        nomes[4] = "Caique";
        nomes[5] = "Danilson";
        nomes[6] = "Diego";
        nomes[7] = "Alisson";
        nomes[8] = "Edney";
        nomes[9] = "Carlos";

        System.out.println("Imprimindo os nomes da lista...");
        System.out.println("O primeiro nome é: "+nomes[0]);
        System.out.println("O segundo nome é: "+nomes[1]);
        System.out.println("O terceiro nome é: "+nomes[2]);
        System.out.println("O quarto nome é: "+nomes[3]);
        System.out.println("O quinto nome é: "+nomes[4]);
        System.out.println("O sexto nome é: "+nomes[5]);
        System.out.println("O setimo nome é: "+nomes[6]);
        System.out.println("O oitavo nome é: "+nomes[7]);
        System.out.println("O nono nome é: "+nomes[8]);
        System.out.println("O decimo nome é: "+nomes[9]);
        System.out.println("----------------------------------");

        System.out.println("Imprimindo os nomes pela Loop For: ");

        for (int i = 0; i < nomes.length; i++){
            System.out.println("O primeiro nome  " + (i+1) + " é: " + nomes[i]);

        }
    }
}
