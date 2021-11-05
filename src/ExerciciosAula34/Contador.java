package ExerciciosAula34;

public class Contador {

    private static int cont;

    public Contador (){
        cont ++;
    }
    public static void incrmentar(){
        cont++;
    }

    public static void zerar(){
        cont = 0;
    }

    public static int obterValor(){
        return cont;
    }

    public static int imprimirValor(){
        return cont;
    }


}
