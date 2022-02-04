package br.com.abc.introducao.A11_Enumercao.test;

import br.com.abc.introducao.A11_Enumercao.classe.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", Cliente.PESSOA_FISICA);
        System.out.println(cliente);

    }
}
