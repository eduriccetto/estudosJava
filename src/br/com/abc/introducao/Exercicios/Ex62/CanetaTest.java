package br.com.abc.introducao.Exercicios.Ex62;

import java.util.Locale;
import java.util.Scanner;

public class CanetaTest {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String marca, cor;
        double preco;

        System.out.println("========================");
        System.out.println("|     Classe Caneta    |");
        System.out.println("========================");

        System.out.println("\n");
        System.out.print("Digite a marca da caneta: ");
        marca = entrada.next().toUpperCase(Locale.ROOT);
        System.out.print("Digite a cor da caneta: ");
        cor = entrada.next().toUpperCase(Locale.ROOT);
        System.out.print("Digite o preço da caneta: ");
        preco = entrada.nextDouble();

        Caneta bic = new Caneta();
        bic.marca = marca;
        bic.cor = cor;
        bic.preco = preco;

        Caneta padrao = new Caneta();
        padrao.setMarca("Monblanc");
        padrao.setCor("Dourada");
        padrao.setPreco(980);

        System.out.println("\n");
        System.out.println("-------------------------------");
        System.out.println("     Caneta escolhida          ");
        System.out.println("Marca: " + bic.marca);
        System.out.println("Cor: " + bic.cor);
        System.out.println("Preço: " + bic.preco);
        System.out.println("-------------------------------");
        System.out.println("  Caneta padrão p/ comparação  ");
        System.out.println("Marca: " + padrao.getMarca());
        System.out.println("Cor: " + padrao.getCor());
        System.out.println("Preço: " + padrao.getPreco());
        System.out.println("-------------------------------");

    }
}
