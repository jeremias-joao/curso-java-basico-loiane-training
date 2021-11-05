package com.loiane.cursojava.aula.aula38_HerancaSuper;

public class Aluno extends Pessoa {

    private String curso;
    private double [] notas;

    public Aluno(){ }

    public Aluno(String nome, String endereco, String telefone, String curso ) {
        super(nome, endereco, telefone);

        this.curso = curso;
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }




    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        this.setCpf("244444488");

        super.setCpf("244444488");
    }

}