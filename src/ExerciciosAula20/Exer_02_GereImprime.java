package ExerciciosAula20;

import java.util.Random;

public class Exer_02_GereImprime {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

    }
}
