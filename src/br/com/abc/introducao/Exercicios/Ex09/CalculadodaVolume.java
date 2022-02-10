/*************************************************************************************************
 * 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
 * 		V = 3.14159 * R * R * A
 * 		Onde as variáveis: V, R e A representam respetivamente o volume, o raio e a altura.
 **************************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex09;

import java.util.Scanner;

public class CalculadodaVolume {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double volume, raio, altura;

        System.out.println("============================================================");
        System.out.println("|                   Calculadora de Volume                  |");
        System.out.println("============================================================");

        System.out.print("\nDigite o raio do obj: ");
        raio = entrada.nextDouble();
        System.out.print("Digite a altura do obj: ");
        altura = entrada.nextDouble();

        volume = (double) (Math.round((((3.14159 * raio) * raio) * altura)*100)/100);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("O obj de altura " + altura + " e raio " + raio + " possui o volume de: " + volume);
        System.out.println("------------------------------------------------------------------------");

    }
}
