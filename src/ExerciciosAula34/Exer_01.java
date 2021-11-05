package ExerciciosAula34;

public class Exer_01 {

    static  void imprimirValor(){
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] args) {

        imprimirValor();

        Contador.incrmentar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

        Contador.incrmentar();
            Contador.incrmentar();
                Contador.incrmentar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();





    }
}
