
/*******************************************************************************
 * 13) Escreva um programa que leia 5 números inteiros e imprima na tela os
 * valores em ordem decrescente.
 *******************************************************************************/

package br.com.abc.introducao.Exercicios.Ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] lista = new int[5];

        System.out.println("======================================================");
        System.out.println("                Ordenador Decrescente                |");
        System.out.println("======================================================\n");

        int contador = 0;
        int contador2 = 1;
        while (contador != 5){
            System.out.print("Digite um valor inteiro para N" + contador2 + ": ");
            lista[contador] = entrada.nextInt();
            contador += 1;
        }
        LinkedList<Integer>list = new LinkedList<Integer>();
                list.add(lista[0]);
                list.add(lista[1]);
                list.add(lista[2]);
                list.add(lista[3]);
                list.add(lista[4]);


        Collections.sort(list, Collections.reverseOrder()); // Está reclamação da IDE no sort não atrapalha

        System.out.println(list);

    }
}

