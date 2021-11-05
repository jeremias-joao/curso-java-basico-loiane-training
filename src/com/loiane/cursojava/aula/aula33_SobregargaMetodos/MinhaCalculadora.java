package com.loiane.cursojava.aula.aula33_SobregargaMetodos;

public class MinhaCalculadora {


        public static int soma(int num1, int num2){
            return num1 + num2;
        }

        public double soma(double num1, double num2){
            return num1 + num2;
        }

        public int soma(int num1, int num2, int num3){
            return num1 + num2;
        }

        public int soma(int[] vectorInteiros){
            int total = 0;
            for (int i =0; i<vectorInteiros.length; i++){
                total += vectorInteiros[i];
            }
            return total;
        }






}
