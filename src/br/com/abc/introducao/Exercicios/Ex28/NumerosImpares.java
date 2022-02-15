/*******************************************************************************
 * 28) Faça um programa que gera e escreve os números ímpares entre 100 e 200.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex28;

public class NumerosImpares {
    public static void main(String[] args) {

        int inicio = 100;

        System.out.println("============================================");
        System.out.println("|   Exibindo numeros impares de 100 à 200  |");
        System.out.println("============================================\n");

        for (int x = 0; x < 100; x++){
            inicio += 1;
            if ((inicio % 2) == 1){
                System.out.print(inicio+" ");
            }
        }

    }
}
