/*******************************************************************************
 * 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for
 * negativo, em B. No final mostrar o resultado.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex22;

import java.util.Scanner;

public class PosiAnegB {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double n1, n2, a = 0, b = 0;

        System.out.println("=========================================");
        System.out.println("|      Positivo no A e Negativo no B    |");
        System.out.println("=========================================");

        System.out.print("\nDigite um valor: ");
        n1 = entrada.nextDouble();
        if (n1 > 0){
            a += n1;
            System.out.println("Numero armazenado em A");
        }else {
            b += n1;
            System.out.println("Numero armazenado em B");
        }
        System.out.print("Digite outro valor: ");
        n2 = entrada.nextDouble();
        if (n2 > 0){
            a += n2;
            System.out.println("Numero armazenado em A");
        }else {
            b += n2;
            System.out.println("Numero armazenado em B");
        }

        System.out.println("====================================");
        System.out.println("   A: "+a);
        System.out.println("   B: "+b);
        System.out.println("====================================");

    }

}
