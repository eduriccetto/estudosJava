package br.com.abc.introducao.A7_Associacao.test;

import br.com.abc.introducao.A7_Associacao.classes.Aluno;
import br.com.abc.introducao.A7_Associacao.classes.Local;
import br.com.abc.introducao.A7_Associacao.classes.Professor;
import br.com.abc.introducao.A7_Associacao.classes.Seminario;

public class Cadastro {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eduardo", 31);
        Aluno aluno2 = new Aluno("Joana Dark", 234);
        Seminario seminario1 = new Seminario("Segurança da Informação");
        Seminario seminario2 = new Seminario("Feminismo Antigo");
        Professor professor1 = new Professor("Yoda", "Usar a força para programar");
        Local local1 = new Local("Rua das Araras", "São Geronimo");

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);

        seminario1.setProfessor(professor1);
        seminario1.setLocal(local1);
        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});

        Seminario[] seminarioArray = new Seminario[1];
        seminarioArray[0] = seminario1;
        professor1.setSeminarios(seminarioArray);

        System.out.println("===================================");
        System.out.println("* Alunos:");
        aluno1.print();
        aluno2.print();
        System.out.println("===================================");
        System.out.println("* Seminários:");
        seminario1.print();
        System.out.println("===================================");
        System.out.println("* Professores:");
        professor1.print();
        System.out.println("===================================");
        System.out.println("* Local:");
        local1.print();

    }
}
