/*******************************************************************************
 * 42) Faça um programa que determine o maior e o menor entre N números lidos.
 * A condição de parada é a entrada de um valor 0, ou seja, o programa deve ficar
 * executando até que a entrada seja igual a 0 (ZERO).
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex42;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, maior = 0, menor = 2000000;
        boolean loop = true;

        System.out.println("=====================================");
        System.out.println("|            Maior e Menor          |");
        System.out.println("=====================================");

        System.out.println("Digite valores inteiros para determinar qual o maior ou menor.");
        System.out.println("Para encerrar a execução do programa digite 0.");
        System.out.println("------------------");

        System.out.print("\n");
        while (loop){
            System.out.print("Digite um valor: ");
            n = entrada.nextInt();
            if (n == 0){
                loop = false;
            }else {
                if (n > maior){
                    maior = n;
                }
                if (n < menor){
                    menor = n;
                }
            }

        }

        System.out.println("-------------------------");
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);

        System.out.println("\n");
        System.out.println("=================");
        System.out.println(" Fim da Execução");
        System.out.println("=================");

    }
}
