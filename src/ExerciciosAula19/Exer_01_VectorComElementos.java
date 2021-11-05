package ExerciciosAula19;

import java.util.Scanner;

public class Exer_01_VectorComElementos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scanner.nextInt();

            vetorB[i] = vetorA[i];
        }

        /*for(int i=0; i<vetorA.length; i++){
            vetorB[i] = vetorB[i];
        } */

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();



        scanner.close();



    }
}
