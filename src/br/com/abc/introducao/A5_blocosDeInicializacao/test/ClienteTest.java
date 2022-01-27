package br.com.abc.introducao.A5_blocosDeInicializacao.test;

import br.com.abc.introducao.A5_blocosDeInicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        System.out.println(" ");
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela: c.getParcelas()){
            System.out.print(parcela + " ");
        }

    }
}
