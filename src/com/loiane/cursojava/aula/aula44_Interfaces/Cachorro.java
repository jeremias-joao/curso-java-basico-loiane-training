package com.loiane.cursojava.aula.aula44_Interfaces;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{


    private int tamanho;
    private String ra�a;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRa�a() {
        return ra�a;
    }

    public void setRa�a(String ra�a) {
        this.ra�a = ra�a;
    }

    @Override
    public void emitirSoma() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPasear() {

    }
}
