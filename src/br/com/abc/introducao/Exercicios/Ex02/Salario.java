package br.com.abc.introducao.Exercicios.Ex02;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        // ==========  Atributos e declarações =============================================
        String[] nome = new String[3];
        String[] cargo = new String[3];
        int[] idade = new int[3];
        double[] salario = new double[3];

        Scanner entrada = new Scanner(System.in);     // Declarando scanner de entrada

        // ==========================  Cadastro de funcionários =============================
        int contador = 0;
        while (contador != 3){

            System.out.print("Digite o nome do funcionário: ");
            nome[contador] = entrada.next().toUpperCase(Locale.ROOT);
            System.out.print("Digite o cargo do funcionário: ");
            cargo[contador] = entrada.next().toUpperCase(Locale.ROOT);
            System.out.print("Digite a idade do funcionário: ");
            idade[contador] = entrada.nextInt();
            System.out.print("Digite o salário do funcionário: ");
            salario[contador] = entrada.nextDouble();

            System.out.println("--------------------------------------------------------------------");
            contador += 1;
        }

        System.out.println("===============================================================");

        // ============= Imprime na tela os funcionários cadastrados ==============================

        contador = 0;
        while (contador != 3){
            System.out.println("Nome: " + nome[contador] + "\nCargo: " + cargo[contador] +
                    "\nIdade: " + idade[contador] + "\nSalário: " + salario[contador]);
            System.out.println("---------------------------------------------------------------------------");
            contador += 1;
        }

        // ================= Média Salárial =========================================================
        double mediaSalarial = 0;
        for (double i : salario){
            mediaSalarial += i;
        }                                              // limitação 2 casas após á virgula
        double resultado = (double) (Math.round((mediaSalarial / salario.length)*100.0)/100.0);
        System.out.println("Média salarial da empresa: " + resultado);
    }
}
