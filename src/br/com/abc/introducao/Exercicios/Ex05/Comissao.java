/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida
 *************************************************************************/
package br.com.abc.introducao.Exercicios.Ex05;

import java.util.Locale;
import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String vendedor, peca;
        double precoPeca, comissao;
        int qtd;
        int porcentagemComissao = 5;

        System.out.println("===============================================");
        System.out.println("|           Calculadora de Comissão           |");
        System.out.println("===============================================");

        System.out.print("Digite o nome do vendedor: ");
        vendedor = entrada.next().toUpperCase(Locale.ROOT);
        System.out.print("Digite o nome da peça: ");
        peca = entrada.next().toUpperCase(Locale.ROOT);
        System.out.print("Digite o preço da peça: ");
        precoPeca = entrada.nextDouble();
        System.out.print("Digite a quantidade vendida: ");
        qtd = entrada.nextInt();

        comissao = ((precoPeca * qtd) / 100) * porcentagemComissao;

        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Vendeu " + qtd + " " + peca + " no preço de " + precoPeca);
        System.out.println("A comissão sobre as vendas de " + vendedor + " é de " + comissao);
        System.out.println("-----------------------------------------------------------");

    }
}
