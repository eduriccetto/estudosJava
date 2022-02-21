/*******************************************************************************
 * 60) Escreva um programa que retorne o número do quadrante (A, B, C ou D) através
 * de um método chamado VERIFICA_QUADRANTE, que deve receber um valor para x e um
 *	valor para y.
 Quadrantes
 *         x |
 *           |
 *     2o    |     1o
 *           |
 *y ----------------------
 *           |
 *           |
 *     3o    |     4o
 *           |
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex60;

import java.util.Scanner;

public class ValorDoQuadrante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int eixoX, eixoY;
        String quadrante = "";

        System.out.println("==================================");
        System.out.println("|       Verifica Quadrante       |");
        System.out.println("==================================");

        System.out.println("                 x 10                  ");
        System.out.println("                   |                  ");
        System.out.println("                   |                  ");
        System.out.println("         A         |        B         ");
        System.out.println("                   |                  ");
        System.out.println("y                  |                  ");
        System.out.println("0 ----------------------------------  10");
        System.out.println("                   |                  ");
        System.out.println("                   |                  ");
        System.out.println("         C         |        D         ");
        System.out.println("                   |                  ");
        System.out.println("                   |                  ");
        System.out.println("                    0                  ");

        System.out.println("\n");
        System.out.print("Digite um valor para o eixo X: ");
        eixoX = entrada.nextInt();
        System.out.print("Digite um valor para o eixo Y: ");
        eixoY = entrada.nextInt();

        if (eixoX >= 5 && eixoY >= 5){
            quadrante = "B";
        }
        if (eixoX >= 5 && eixoY <= 5){
            quadrante = "A";
        }
        if (eixoX <= 5 && eixoY >= 5){
            quadrante = "D";
        }
        if (eixoX <= 5 && eixoY <= 5){
            quadrante = "C";
        }if (eixoX == 5 && eixoY == 5){
            quadrante = "CENTRAL";
        }

        System.out.println("\n");
        System.out.println("===========================");
        System.out.println("QUADRANTE: "+quadrante);
        System.out.println("===========================");

    }

}
