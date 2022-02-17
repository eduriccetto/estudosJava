
/*******************************************************************************
 * 44) Faça um programa que exiba as opções:
 * 	1 – Conversão de Graus Celsius em Graus Fahrenheit
 * 	2 – Conversão de Graus Fahrenheit em Graus Celsius
 * 	3 – Peso ideal do homem
 * 	4 – Peso ideal da mulher
 * O programa só deve encerrar quando o usuário digitar  ́S ́ para a pergunta
 *  “Deseja encerrar o programa?”
 * Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex44;

import java.util.Locale;
import java.util.Scanner;

public class ProgramLoop {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        String status;
        boolean loop = true;

        System.out.println("======================================================");
        System.out.println("|                      Program Loop                  |");
        System.out.println("======================================================");
        System.out.println("  1 – Conversão de Graus Celsius em Graus Fahrenheit  ");
        System.out.println("  2 – Conversão de Graus Fahrenheit em Graus Celsius  ");
        System.out.println("  3 – Peso ideal do homem                             ");
        System.out.println("  4 – Peso ideal da mulher                            ");
        System.out.println("======================================================");

        while (loop){

            System.out.print("\nDigite um número inteiro: ");
            n = entrada.nextInt();

            switch (n){
                case 1:
                    double fahrenheit, celsius;

                    System.out.println("=================================================");
                    System.out.println("|         Calculadora de Conversão Celsius      |");
                    System.out.println("=================================================");

                    System.out.print("\nDigite o falor Fahrenheit que deseja converter para Celcius: ");
                    fahrenheit = entrada.nextDouble();
                    celsius = (double) (Math.round((((fahrenheit - 32) * 5) / 9) * 100) / 100);

                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("A temperatura Fahrenheit de " + fahrenheit + " convertida em Celcius é: " + celsius + " graus Celcius");
                    System.out.println("----------------------------------------------------------------------------");

                    break;
                case 2:
                    double celcius, f;

                    System.out.println("======================================================");
                    System.out.println("|         Conversor de Celsius para Fahrenheit       |");
                    System.out.println("======================================================");

                    System.out.print("\n Digite o valor em Celsius que deseja converter: ");
                    celcius = entrada.nextDouble();

                    f = (9 * celcius +160) / 5;

                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("O Valor convertido de " + celcius + " Graus Celsius, equivale a " + f + " Fahrenheit");
                    System.out.println("--------------------------------------------------------------------------");

                    break;
                case 3:
                    double altura, peso;

                    System.out.println("============================================");
                    System.out.println("|          Calculadora Peso Ideal          |");
                    System.out.println("============================================");

                    System.out.print("Digite altura da pessoa: ");
                    altura = entrada.nextDouble();

                    peso = (72.7 * altura) - 58;

                    System.out.println("\n------------------------------------");
                    System.out.println("    O peso ideal é: " + peso);
                    System.out.println("------------------------------------");

                    break;
                case 4:
                    double alturaM, pesoM;

                    System.out.println("============================================");
                    System.out.println("|          Calculadora Peso Ideal          |");
                    System.out.println("============================================");

                    System.out.print("Digite altura da pessoa: ");
                    alturaM = entrada.nextDouble();

                    pesoM = (62.1 * alturaM) - 44.7;

                    System.out.println("\n------------------------------------");
                    System.out.println("    O peso ideal é: " + pesoM);
                    System.out.println("------------------------------------");

                    break;
            }




            System.out.println("--------------------------------");


            System.out.print("\nDeseja encerrar o programa[S/n]: ");
            status = entrada.next().toUpperCase(Locale.ROOT);
            if (status.equals("S")){
                loop = false;
            }
        }

        System.out.println("\n");
        System.out.println("=====================");
        System.out.println("|  Fim da Execução  |");
        System.out.println("=====================");

    }
}
