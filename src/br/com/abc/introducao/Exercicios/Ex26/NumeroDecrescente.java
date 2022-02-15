/*******************************************************************************
 * 26) Escreva um programa que exiba os números de 1 a 100 na tela em ordem
 * decrescente.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex26;

public class NumeroDecrescente {
    public static void main(String[] args) {

        int num = 100;

        while (num > 0){
            System.out.print(num+" ");    //   com método while
            num -= 1;
        }

        System.out.println("\n=========================================================");
        for (int x = 100; x>0; x--){
            System.out.print(x+" ");      //   com método for
        }

    }
}
