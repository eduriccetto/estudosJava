package br.com.abc.introducao.A10_ModificadorFinal.test;

import br.com.abc.introducao.A10_ModificadorFinal.classe.Carro;

public class Test {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setNome("Celta");
        c.setMarca("Chevrolet");

        System.out.println(c);
    }
}
