/*******************************************************************************
 * 38) Faça um programa que leia as variáveis C e N, respectivamente código e
 * número de horas trabalhadas de um operário. E calcule o salário sabendo-se que
 * ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50, calcule o
 * excesso de pagamento armazenando-o na variável E, caso contrário zerar tal
 * variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
 * imprimir o salário total e o salário excedente. O programa só deve parar de
 * rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
 * programa?".
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex38;

import java.util.Locale;
import java.util.Scanner;

public class SistemaPagamento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean looping = true;
        String status;
        double cod, horas, calc, horasEx, calcHorasEx;

        System.out.println("=====================================");
        System.out.println("|       Sistema de Pagamentos       |");
        System.out.println("=====================================");

        while (looping){

            System.out.print("\nDigite o cód do operario: ");
            cod = entrada.nextDouble();
            System.out.print("Digite o numero de horas trabalhadas: ");
            horas = entrada.nextDouble();
            calc = 10 * horas;

            if (horas <= 50){
                System.out.println("\n");
                System.out.println("----------------------------");

                System.out.println("Salário do operário cód("+cod+") é de R$"+calc);
            }

            if (horas > 50){
                horasEx = horas - 50;
                horas = horas - horasEx;
                calcHorasEx = 20 * horasEx;
                calc = 10 * horas;
                System.out.println("Salário do operário cód("+cod+") é de R$"+calc);
                System.out.println("E recebeu mais R$"+calcHorasEx+" de horas extras, dando um total de "+(calcHorasEx+calc));

            }


            System.out.println("\n");
            System.out.println("--------------------------------------");
            System.out.print("\nDeseja encerrar o programa[S/N]: ");
            status = entrada.next().toUpperCase(Locale.ROOT);
            if (status.equals("S")){
                looping = false;
            }
        }

        System.out.println("\n");
        System.out.println("========================");
        System.out.println("|   Fim da Execução    |");
        System.out.println("========================");

    }
}
