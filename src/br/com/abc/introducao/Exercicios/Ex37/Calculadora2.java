/*******************************************************************************
 * 37) Faça um programa de conversão de base numérica. O programa deverá
 * apresentar uma tela de entrada com as seguintes opções:
 *		1 – Adição
 *		2 – Subtração
 *		3 – Multiplicação
 *		4 – Divisão
 * Informe a opção:
 * A partir da opção escolhida, o programa deverá solicitar para que o usuário
 * digite dois números. Em seguida, o programa deve exibir o resultado da opção
 * indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao menu
 * principal. Caso a resposta seja  ́S ́ ou  ́s ́, deverá voltar ao menu, caso
 * contrário deverá encerrar o programa.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex37;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;
        double n1, n2, result;
        String status;
        boolean looping = true;

        while (looping){

            System.out.println("=================================");
            System.out.println("|          Calculadora 2        |");
            System.out.println("=================================");
            System.out.println("|   1 – Adição                  |");
            System.out.println("|   2 – Subtração               |");
            System.out.println("|   3 – Multiplicação           |");
            System.out.println("|   4 – Divisão                 |");
            System.out.println("=================================");

            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextInt();
            System.out.print("Digite o primeiro valor: ");
            n1 = entrada.nextDouble();
            System.out.print("Digite o segundo valor: ");
            n2 = entrada.nextDouble();

            switch (opcao){
                case 1:
                    result = n1 + n2;
                    System.out.println("O resultado da operação "+n1+" + "+n2+" = "+result);
                    break;
                case 2:
                    result = n1 - n2;
                    System.out.println("O resultado da operação "+n1+" - "+n2+" = "+result);
                    break;
                case 3:
                    result = n1 * n2;
                    System.out.println("O resultado da operação "+n1+" * "+n2+" = "+result);
                    break;
                case 4:
                    result = n1 / n2;
                    System.out.println("O resultado da operação "+n1+" / "+n2+" = "+result);
                    break;
            }

            System.out.print("\nDeseja voltar ao menu principal[S/N]: ");
            status = entrada.next().toUpperCase(Locale.ROOT);
            if (!status.equals("S")){
                looping = false;
            }
        }

        System.out.println("\n");
        System.out.println("========================");
        System.out.println("|    Fim da Execução   |");
        System.out.println("========================");

    }
}
