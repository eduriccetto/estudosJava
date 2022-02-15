/*******************************************************************************
 * 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um
 * programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * (h = altura)
 *   - Para homens: (72.7*h) - 58
 *   - Para mulheres: (62.1 *h) - 44.7
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex25;

import java.util.Locale;
import java.util.Scanner;

public class CalcPesoIdeal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double altura, peso;
        String sexo;

        System.out.println("============================================");
        System.out.println("|          Calculadora Peso Ideal          |");
        System.out.println("============================================");

        System.out.print("\nDigite sexo[M/F] da passoa: ");
        sexo = entrada.next().toUpperCase(Locale.ROOT);
        System.out.print("Digite altura da pessoa: ");
        altura = entrada.nextDouble();

        if (sexo.equals("M")){
            peso = (72.7 * altura) - 58;
        }else {
            peso = (double) Math.round ((62.1 * altura) - 44.7);
        }

        System.out.println("\n------------------------------------");
        System.out.println("    O peso ideal é: " + peso);
        System.out.println("------------------------------------");
    }
}
