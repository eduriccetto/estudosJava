package br.com.abc.introducao.A11_Enumercao.test;

import br.com.abc.introducao.A11_Enumercao.classe.ClienteStatus;
import br.com.abc.introducao.A11_Enumercao.classe.StatusCliente;

public class StatusClienteTest {
    public static void main(String[] args) {
        ClienteStatus cliente = new ClienteStatus("Maria", StatusCliente.ATIVO);
        System.out.println(cliente);
    }
}
