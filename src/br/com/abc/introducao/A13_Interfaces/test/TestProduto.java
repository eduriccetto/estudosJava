package br.com.abc.introducao.A13_Interfaces.test;

import br.com.abc.introducao.A13_Interfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notboock", 4, 3000);
        p.calcularImposto();
        p.calculaFrete();

        System.out.println(p);
    }
}
