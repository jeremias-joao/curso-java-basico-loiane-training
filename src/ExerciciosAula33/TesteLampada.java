package ExerciciosAula33;

import ExerciciosAula27.Lampada;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();


    }

}
