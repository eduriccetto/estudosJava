/*******************************************************************************
 * 55) Fazer um programa que leia uma frase de até 50 caracteres e imprima a
 * frase sem os espaços em branco.
 * Imprimir também a quantidade de espaços em branco da frase.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex55;

import java.util.Locale;
import java.util.Scanner;

public class AnaliseFrase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase;

        System.out.println("");
        System.out.println("Digite uma frase de até 50 caracteres.");
        System.out.println("Se já tiver terminado digite 0.");
        System.out.print("Aqui: ");
        do {
            frase = entrada.nextLine().toUpperCase(Locale.ROOT);
            if (frase.length() > 50){
                System.out.println("Sua frase tem mais de 50 caracteres, tente denovo!");
                System.out.print("Aqui: ");
            }
        }while (frase.length()>50);

        char[] ArrayChars = frase.toCharArray();

        String novaFrase = "";

        for (int i = 0; i < ArrayChars.length; i++) {
            if (ArrayChars[i]!=' '){
                novaFrase = novaFrase + ArrayChars[i];
            }
        }

        System.out.println("\n");
        System.out.println("---------------------------------");
        System.out.println("Frase original: "+frase);
        System.out.println("\n");
        System.out.println("----------------------------------");
        System.out.println("Frase sem espaços: "+novaFrase);

        System.out.println("\n");
        System.out.println("=========================");
        System.out.println("      Fim da Execução!  |");
        System.out.println("=========================");
    }
}
