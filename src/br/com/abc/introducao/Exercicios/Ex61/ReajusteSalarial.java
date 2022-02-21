/*******************************************************************************
 * 61) Escreva um programa que calcule e retorne o salário atualizado através do
 * método REAJUSTE. O método deve receber o valor do salário e o índice de
 * reajuste.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex61;

import java.util.Scanner;

public class ReajusteSalarial {

    public static double Reajuste(double Salario, double Indice){
        return Salario + ((Salario * Indice)/100);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salario, indice, novoSalario;

        System.out.println("============================");
        System.out.println("|     Reajuste Salarial    |");
        System.out.println("============================");

        System.out.println("\n");
        System.out.print("Digite o valor do salario do funcionário: ");
        salario = entrada.nextDouble();
        System.out.print("Digite o indice de reajuste porcentual: ");
        indice = entrada.nextDouble();

        System.out.println("\n");
        System.out.println("----------------------------");
        novoSalario = Reajuste(salario, indice);
        System.out.print("O novo salário do funcionário é de: "+novoSalario);

    }

}
