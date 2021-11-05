package ExerciciosAula24;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jeremias";
        aluno1.sexo = "M";
        aluno1.dataNasc = "15/03/2021";
        aluno1.idade = 21;
        aluno1.salario = 2.000;

        System.out.println(aluno1.nome);
        System.out.println(aluno1.sexo);
        System.out.println(aluno1.dataNasc);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.salario);


        Aluno aluno2 = new Aluno();
        aluno2.nome = "Anitta";
        aluno2.sexo = "F";
        aluno2.dataNasc = "17/05/2027";
        aluno2.idade = 19;
        aluno2.salario = 1.000;

        System.out.println(aluno2.nome);
        System.out.println(aluno2.sexo);
        System.out.println(aluno2.dataNasc);
        System.out.println(aluno2.idade);
        System.out.println(aluno2.salario);


    }
}
