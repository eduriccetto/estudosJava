package br.com.abc.introducao.A14_Polimorfismo.test;

import br.com.abc.introducao.A14_Polimorfismo.classes.Funcionario;
import br.com.abc.introducao.A14_Polimorfismo.classes.Gerente;
import br.com.abc.introducao.A14_Polimorfismo.classes.RelatorioDePagamento;
import br.com.abc.introducao.A14_Polimorfismo.classes.Vendedor;

public class Test {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri", 2000, 20000);
        RelatorioDePagamento relatorio = new RelatorioDePagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        relatorio.relatorioPagamentoVendedor(v);
//
        relatorio.relatorioPagamentoGenerico(g);
        relatorio.relatorioPagamentoGenerico(v);

        Funcionario f = g;
        System.out.println("##############################");
        System.out.println(f.getSalario());
    }
}
