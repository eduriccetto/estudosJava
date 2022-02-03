package br.com.abc.introducao.A8_Heranca.test;

import br.com.abc.introducao.A8_Heranca.classes.Endereço;
import br.com.abc.introducao.A8_Heranca.classes.Funcionario;
import br.com.abc.introducao.A8_Heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereço end = new Endereço();
        Funcionario f = new Funcionario();
        p.setNome("Gina");
        p.setCpf("123456");
        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
        p.setEndereço(end);

        f.setSalario(1000);
        f.setEndereço(end);
        f.setNome(p.getNome());
        f.setCpf(p.getCpf());


        f.print();
        f.imprimeReciboDePagamento();
    }
}
