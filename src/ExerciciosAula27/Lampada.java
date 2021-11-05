package ExerciciosAula27;

/**
 1- Escreva uma classe para representar uma lampda.
 Desenvolva metodos para ligar deligar a lampada
 */
public class Lampada {


    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mostrarEstado(){
        if (ligada){
            System.out.println("L�mpada est� ligada");
        } else {
            System.out.println("L�mpada est� desligada");
        }
    }

    public void mudarEstado(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }
}