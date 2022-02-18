/*******************************************************************************
 * 50) Fazer um programa que sorteie um número de 0 a 100 e que permita que o
 * usuário (sem conhecer o número sorteado) tente acertar. Caso não acerte, o
 * programa deve imprimir uma mensagem informando se o número sorteado é maior ou
 * menor que a tentativa feita. Ao acertar o número, o programa deve imprimir a
 * quantidade de tentativas feitas.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex50;

import java.util.Random;
import java.util.Scanner;

public class AcerteNumero {
    public static void main(String[] args) {

        Scanner  entrada = new Scanner(System.in);
        Random random = new Random();
        int n;
        boolean loop = true;

        System.out.println("=============================");
        System.out.println("     Chute um número!        ");
        System.out.println("=============================");

        while (loop){
            System.out.print("\nDigite um valor de 0 à 100: ");
            n = entrada.nextInt();
            int number = random.nextInt(100);
            if (n == number){
                loop = false;

                System.out.println("\n");
                System.out.println("--------------------------");
                System.out.println("         Parabéns!!! =)   ");
                System.out.println("--------------------------");
                System.out.println("Você chutou "+n+" e a máquina chutou "+number);

            }else {
                System.out.println("\n");
                System.out.println("--------------------------");
                System.out.println("Não foi desta vez =(      ");
                System.out.println("--------------------------");
                System.out.println("Você chutou "+n+" e a máquina chutou "+number);
            }
        }
    }
}
