/*******************************************************************************
 * 29) Faça um programa que exiba os números de 1 até 2000.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex29;

public class ExibeNumero {
    public static void main(String[] args) {

        int n = 0;

        System.out.println("====================================");
        System.out.println("|   Exibindo números de 1 à 2000   |");
        System.out.println("====================================\n");

        for (int x = 1; x <= 2000; x++){
            n += 1;
            System.out.print(n+", ");

        }

    }
}
