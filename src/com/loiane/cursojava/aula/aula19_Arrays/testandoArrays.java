package com.loiane.cursojava.aula.aula19_Arrays;

public class testandoArrays {

    public static void main(String[] args) {

        String[] nomes = new String[10];
        nomes[0] = "Jeremias";
        nomes[1] = "Jo�o";
        nomes[2] = "Sila";
        nomes[3] = "Daniel";
        nomes[4] = "Caique";
        nomes[5] = "Danilson";
        nomes[6] = "Diego";
        nomes[7] = "Alisson";
        nomes[8] = "Edney";
        nomes[9] = "Carlos";

        System.out.println("Imprimindo os nomes da lista...");
        System.out.println("O primeiro nome �: "+nomes[0]);
        System.out.println("O segundo nome �: "+nomes[1]);
        System.out.println("O terceiro nome �: "+nomes[2]);
        System.out.println("O quarto nome �: "+nomes[3]);
        System.out.println("O quinto nome �: "+nomes[4]);
        System.out.println("O sexto nome �: "+nomes[5]);
        System.out.println("O setimo nome �: "+nomes[6]);
        System.out.println("O oitavo nome �: "+nomes[7]);
        System.out.println("O nono nome �: "+nomes[8]);
        System.out.println("O decimo nome �: "+nomes[9]);
        System.out.println("----------------------------------");

        System.out.println("Imprimindo os nomes pela Loop For: ");

        for (int i = 0; i < nomes.length; i++){
            System.out.println("O primeiro nome  " + (i+1) + " �: " + nomes[i]);

        }
    }
}
