package br.com.abc.introducao.javaCore.introducao.sobrecargaConstrutores.test;

import br.com.abc.introducao.javaCore.introducao.sobrecargaConstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12212", "Carlos", new double[]{5,7,9}, "27/01/2022");
        est.imprime();
    }
}
