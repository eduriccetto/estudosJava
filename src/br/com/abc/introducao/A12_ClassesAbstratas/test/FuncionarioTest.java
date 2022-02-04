package br.com.abc.introducao.A12_ClassesAbstratas.test;

import br.com.abc.introducao.A12_ClassesAbstratas.classes.Funcionario;
import br.com.abc.introducao.A12_ClassesAbstratas.classes.Gerente;
import br.com.abc.introducao.A12_ClassesAbstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Anna", "11122-2", 2000);
        Vendedor v = new Vendedor("Camila", "22211-2", 1500, 5000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println(v);
    }
}
