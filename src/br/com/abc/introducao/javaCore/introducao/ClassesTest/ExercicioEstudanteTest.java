package br.com.abc.introducao.javaCore.introducao.ClassesTest;

import br.com.abc.introducao.javaCore.introducao.Classes.ExercicioEstudante;

public class ExercicioEstudanteTest {
    public static void main(String[] args) {
        ExercicioEstudante eduardo = new ExercicioEstudante();
        eduardo.nome = "Eduardo";
        eduardo.idade = 31;
        eduardo.notas = new int[]{5,6,6};
        eduardo.media = ((float) eduardo.notas[0] + eduardo.notas[1] + eduardo.notas[2]) / 3;
        if (eduardo.media >= 6.0){
            eduardo.status = "Aprovado!";
        }else {
            eduardo.status = "Reprovado!";
        }
        System.out.println("=====================================");
        String message = String.format("Nome do aluno: %s \nIdade do aluno: %s \nNotas do Aluno = \n" +
                "   nota 1: %s\n   nota 2: %s\n   nota 3: %s \nMédia do aluno: %s \nAluno %s %s",
                eduardo.nome, eduardo.idade, eduardo.notas[0], eduardo.notas[1], eduardo.notas[2],
                String.format("%.2f", eduardo.media), eduardo.nome, eduardo.status);

        System.out.println(message);
        System.out.println("=====================================");
    }
}
