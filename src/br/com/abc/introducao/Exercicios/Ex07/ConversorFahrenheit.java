/*****************************************************************************************************************
 * 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
 * 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
 * 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.
 *****************************************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex07;

import java.util.Scanner;

public class ConversorFahrenheit {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
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

    }
}
