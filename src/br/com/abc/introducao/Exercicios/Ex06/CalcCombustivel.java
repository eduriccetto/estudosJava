/*****************************************************************************************************************
 * 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
 * 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
 * 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
 * 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
 * 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
 * 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 *****************************************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex06;

import java.util.Scanner;

public class CalcCombustivel {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double consumo = 12, velocidade, tempo; // velocidade em km/h, tempo em horas e consumo em km/l
        double distancia, litrosUsados;

        System.out.println("=====================================================");
        System.out.println("|            Calculadora de Combustível             |");
        System.out.println("=====================================================");

        System.out.print("\nDigite o tempo gasto na viagem: ");
        tempo = entrada.nextDouble();
        System.out.print("Digite a velocidade média da viagem: ");
        velocidade = entrada.nextDouble();

        distancia = tempo * velocidade;
        litrosUsados = (double) (Math.round((distancia/consumo)*100)/100);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Velocidade Média: " + velocidade + "km/h");
        System.out.println("Tempo gasto: " + tempo + "h");
        System.out.println("Distância Percorrida: " + distancia + "km");
        System.out.println("Quantidade de litros: " + litrosUsados + "L");
        System.out.println("-----------------------------------------------------------------");


    }
}
