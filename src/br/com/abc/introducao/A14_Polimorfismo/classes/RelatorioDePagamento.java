package br.com.abc.introducao.A14_Polimorfismo.classes;

public class RelatorioDePagamento {

    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("================================================");
        System.out.println("Gerando relatório de pagamento para a gerência ");
        System.out.println("================================================");
        gerente.calcularPagamento();
        System.out.println("Nome: "+gerente.getNome());
        System.out.println("Salário: "+gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("===================================================");
        System.out.println("Gerando relatório de pagamento para os vendedores ");
        System.out.println("===================================================");
        vendedor.calcularPagamento();
        System.out.println("Nome: "+vendedor.getNome());
        System.out.println("Salário: "+vendedor.getSalario());
    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("===================================================");
        System.out.println("Gerando relatório de pagamento para funcionário ");
        System.out.println("===================================================");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salário: "+funcionario.getSalario());
    }

}
