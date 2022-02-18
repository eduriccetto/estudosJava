/*******************************************************************************
 * 53) Durante uma corrida de automóveis com N voltas de duração foram anotados
 * para um piloto, na ordem, os tempos registrados em cada volta. Fazer um
 * programa para ler os tempos das N voltas, calcular e imprimir:
 * 	i. melhor tempo;
 * 	ii. a volta em que o melhor tempo ocorreu;
 * 	iii. tempo médio das N voltas;
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex53;

import java.util.Scanner;

public class VoltasPiloto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int voltas, tempo, melhorVolta=5000000, tempoMedio=0;

        System.out.println("========================================");
        System.out.println("|       Estatisticas do Piloto         |");
        System.out.println("========================================");

        System.out.println("\n");
        System.out.print("Digite quantas voltas foram dadas pelo piloto: ");
        voltas = entrada.nextInt();
        int[] vetorVoltas = new int[voltas];

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("---------------------------");
        for (int i = 0; i < voltas; i++) {
            System.out.print("Digite o tempo da primeira volta em segundos: ");
            tempo = entrada.nextInt();
            vetorVoltas[i] = tempo;
        }

        int melhorTempo =  vetorVoltas[0];
        for (int i = 0; i < vetorVoltas.length; i++) {
            if (vetorVoltas[i]<melhorTempo){
                melhorTempo = vetorVoltas[i];
                melhorVolta = i+1;
            }
            tempoMedio += vetorVoltas[i];
        }

        tempoMedio = tempoMedio/voltas;

        System.out.println("\n");
        System.out.println("======================================");
        System.out.println("Melhor tempo "+melhorTempo+" segundos!");
        System.out.println("Volta em que o melhor tempo ocorreu foi a "+melhorVolta+" volta!");
        System.out.println("Tempo médio das "+voltas+" voltas foi de "+tempoMedio+" segundos!");

    }
}
