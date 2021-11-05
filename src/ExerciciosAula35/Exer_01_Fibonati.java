package ExerciciosAula35;
/*
Escreva um metodo recursivo e estatico que calcule e retorne
o N-éstimo termo de sequncia  Fibonacci. Alguns numeros desta sequncia
sao 1,2,3,5,8,13,21,34,55,89...
 */

class Calculadora {

    public static  int fibonacci(int num){

        if(num < 2 ){
            return  1;
        }

        return  fibonacci(num-1) + fibonacci(num-2);
    }

}
