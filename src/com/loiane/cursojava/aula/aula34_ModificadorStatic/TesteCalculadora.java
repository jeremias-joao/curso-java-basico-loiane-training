package com.loiane.cursojava.aula.aula34_ModificadorStatic;


public class TesteCalculadora {
    static int resultdoSoma;

    public static void main(String[] args) {

        resultdoSoma = MinhaCalculadora.soma(1,2);

       /*MinhaCalculadora calc = new MinhaCalculadora();

        calc.soma(1, 2); */
        soma2valores(1,2);


    }
    static  int soma2valores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }

}
