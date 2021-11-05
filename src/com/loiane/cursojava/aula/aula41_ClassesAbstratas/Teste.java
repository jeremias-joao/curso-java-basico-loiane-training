package com.loiane.cursojava.aula.aula41_ClassesAbstratas;

import com.loiane.cursojava.aula.aula40_HerancaPolimorfismoSobrecargaMetodos.Professor;

public class Teste {
    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        /*{
            @Override
            public String obterEtiquetaEndereco() {
                return null;
            }

            @Override
            public void imprimirEtiquetaEndereco() {

            }
        };*/

        //pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        //professor.setEndereco("Rua 3, num 3");

        /**
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        */


         }

}
