/*******************************************************************************
 * 35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma
 * mensagem: "Múltiplo de 10".
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex35;

public class MultiplosDe10 {
    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println("|     Multiplos de 10     |");
        System.out.println("===========================");

        for (int x = 1; x <= 100; x++){
            if (x % 10 == 0){
                System.out.println("-----------------");
                System.out.println(x+" é multiplo de 10");
            } else{
                System.out.println(x);

            }
        }

    }
}
