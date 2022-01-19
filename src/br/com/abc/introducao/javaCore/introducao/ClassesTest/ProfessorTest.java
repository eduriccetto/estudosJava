package br.com.abc.introducao.javaCore.introducao.ClassesTest;

import br.com.abc.introducao.javaCore.introducao.Classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setNome("Gazeta");
        prof.setIdade(62);
        prof.setMateria("ISO 27.001");

        Professor prof2 = new Professor();
        prof2.setNome("Vicentini");
        prof2.setIdade(72);
        prof2.setMateria("Algoritimos");
        prof2.setAposentado(prof2.Aposentado());

        prof.print();
        System.out.println("=================");
        prof2.print();
//        System.out.println("nome: " + prof2.getNome());
//        System.out.println("idade: " + prof2.getIdade());
//        System.out.println("materia: " + prof2.getMateria());
    }
}
