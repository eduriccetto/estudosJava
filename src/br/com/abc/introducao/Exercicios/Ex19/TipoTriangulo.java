/*************************************************************************************************
 * 19) Escreva um programa que leia três valores para os lados de um triângulo
 * (variáveis A, B e C). Verificar se cada lado é menor que a soma dos outros dois lados. Se sim,
 * saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero; Se não, verificar de A==B
 * ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o triângulo
 * será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
 **************************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex19;

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int A, B, C;

        System.out.print("Verificador de Triângulo\n\n");


        System.out.print("Digite o lado A=");
        A = entrada.nextInt();

        System.out.print("Digite o lado B=");
        B = entrada.nextInt();

        System.out.print("Digite o lado C=");
        C = entrada.nextInt();


        if( A < B + C && B < A + C && C < A + B ){
            if(A==B && B == C){
                System.out.print("O triângulo é Eqüilátero.");
            }else if(A==B || A==C || B==C){
                System.out.print("O triângulo é Isósceles.");
            }else{
                System.out.print("O triângulo é Escaleno.");
            }
        }else{
            System.out.print("Os lados fornecidos não caracterizam um triângulo");
        }

    }
}
