package br.com.abc.introducao.Exercicios.Ex63;

import java.util.Locale;
import java.util.Scanner;

public class CanetaTest {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Caneta[] canetas = new Caneta[50];
        int opcao = 5, qtd = 0;
        boolean loop = true;

        while (loop){
            System.out.println("=====================================================");
            System.out.println("  1–Cadastrar caneta");
            System.out.println("  2–Exibir todas as canetas");
            System.out.println("  3–Exibir quantidade de canetas cadastradas");
            System.out.println("  4–Consultar quantidade de canetas de uma " +
                    "\n    determinada cor (digitada pelo usuário)");
            System.out.println("  0-Sair");
            System.out.println("=====================================================");

            System.out.println("\n");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            if (opcao < 0 && opcao > 4){
                System.out.println("\nOpção invalida!");
                break;
            }else {
                switch (opcao){
                    case 1:
                        while (opcao == 1){
                            System.out.println("\n\n\n");
                            System.out.println("=====================================================");
                            System.out.println("  1–Cadastrar caneta");
                            System.out.println("=====================================================");

                            String marca, cor;
                            double preco;

                            System.out.println("\n\n");
                            System.out.print("Digite a marca da caneta: ");
                            marca = entrada.next().toUpperCase(Locale.ROOT);
                            System.out.print("Digite a cor da caneta: ");
                            cor = entrada.next().toUpperCase(Locale.ROOT);
                            System.out.print("Digite o preço da caneta: ");
                            preco = entrada.nextDouble();
                            System.out.println("\n");

                            canetas[qtd] = new Caneta(marca, cor, preco);
                            System.out.println(canetas[qtd]);
                            qtd ++;

                            System.out.println("\n");
                            System.out.println("Deseja cadastrar outra? ");
                            System.out.print("Figite 1 para sim ou 2 para não: ");
                            opcao = entrada.nextInt();
                            if (opcao == 2){
                                break;
                            }

                        }

                        break;
                    case 2:
                        System.out.println("\n\n\n");
                        System.out.println("=====================================================");
                        System.out.println("  2–Exibir todas as canetas");
                        System.out.println("=====================================================\n");

                        for (int i = 0; i < canetas.length; i++) {
                            if (canetas[i] == null){
                                break;
                            }
                            System.out.println(canetas[i]);
                            System.out.println("\n");
                        }

                        break;
                    case 3:
                        System.out.println("=====================================================");
                        System.out.println("  3–Exibir quantidade de canetas cadastradas");
                        System.out.println("=====================================================");

                        int qtdCanetas = 0;
                        for (int i = 0; i < canetas.length; i++) {
                            if (canetas[i] == null){
                                break;
                            }else {
                                qtdCanetas ++;
                            }
                        }

                        System.out.println("\n");
                        System.out.println("----------------------------------------------");
                        System.out.println(" Quantidade de canetas cadastradas: "+qtdCanetas);
                        System.out.println("----------------------------------------------");

                        break;
                    case 4:
                        System.out.println("\n\n\n");
                        System.out.println("=====================================================");
                        System.out.println("  4–Consultar quantidade de canetas de uma " +
                                "\n    determinada cor (digitada pelo usuário)");
                        System.out.println("=====================================================");

                        int qtdCor = 0;
                        String escolhaCor;
                        System.out.print("Digite a cor da caneta: ");
                        escolhaCor = entrada.next().toUpperCase(Locale.ROOT);
                        for (int i = 0; i < canetas.length; i++) {
                            if (canetas[i] == null){
                                break;
                            }
                            if (escolhaCor.equals(canetas[i].getCor())){
                                qtdCor ++;
                            }
                        }
                        System.out.println("-------------------------------------------------------");
                        System.out.println("Na cor "+escolhaCor+" existem "+qtdCor+" cadastradas...");

                        break;
                    case 0:
                        System.out.println("\n\n\n");
                        System.out.println("=====================================================");
                        System.out.println("  0-Sair");
                        System.out.println("=====================================================");
                        loop = false;
                        break;
                }

            }
        }


    }
}
