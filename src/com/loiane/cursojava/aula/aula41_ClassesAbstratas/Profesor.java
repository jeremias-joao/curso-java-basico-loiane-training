package com.loiane.cursojava.aula.aula41_ClassesAbstratas;

import com.loiane.cursojava.aula.aula40_HerancaPolimorfismoSobrecargaMetodos.Pessoa;

class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){

        String s = "Endere�o do Professor: ";
        s += super.getEndereco();

        return s;
    }

    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo endere�o do Professor");
        System.out.println(this.obterEtiquetaEndereco());

    }
}