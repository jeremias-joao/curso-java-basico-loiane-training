package com.loiane.cursojava.aula.aula31_ModificadoresAcesso;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +
                this.capCombustivel * this.consumoCombustivel + " km");
    }
    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }
    private double dividaKMPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
    public double calcularCombustivel(double km){
        return this.dividaKMPorConsumoCombustivel(km);
    }

}
