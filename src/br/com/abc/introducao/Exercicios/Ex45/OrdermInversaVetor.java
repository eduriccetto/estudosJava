/*******************************************************************************
 * 45) Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
 * foi realizada a leitura.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex45;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class OrdermInversaVetor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("==================================");
        System.out.println("|     Ordem Inversa de Vetor     |");
        System.out.println("==================================");

        System.out.println("\n");
        for (int x = 1; x <= 10; x++){
            System.out.print("Digire um valor inteiro: ");
            n = entrada.nextInt();
            list.add(x);
        }

        Collections.reverse(list);

        System.out.println("-------------------------------------------------");
        for (int x = 0; x < 10; x++){
            System.out.print(list.get(x)+", ");
        }
        System.out.println("\n-------------------------------------------------");

    }
}
