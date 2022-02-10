/***********************************************************************************************
 * 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius.
 *       A fórmula de conversão de temperatura a ser utilizada é C = (F - 32) * 5 / 9, em
 *       que a variável F é a temperatura em graus Fahrenheit e a Variável C é a temperatura
 *       em graus Celsius.
 ************************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex08;

import java.util.Scanner;

public class ConversorCelsius {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
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

    }
}
