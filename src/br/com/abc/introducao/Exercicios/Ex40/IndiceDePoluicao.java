/*******************************************************************************
 * 40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03
 * grupos de indústrias que são altamente poluentes do meio ambiente. O índice
 * de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
 * indústrias do 1o grupo são intimadas a suspenderem suas atividades, se o
 * índice crescer para 0,4 as industrias do 1o e 2o grupo são intimadas a
 * suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
 * notificados a paralisarem suas atividades. Faça um programa que leia o índice
 * de poluição medido e emita a notificação adequada aos diferentes grupos de
 * empresas. O algoritmo só deve parar de rodar quando o usuário responder "S" na
 * seguinte pergunta, "Deseja encerrar o programa?".
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex40;

import java.util.Locale;
import java.util.Scanner;

public class IndiceDePoluicao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double indice;
        boolean loop = true;
        String status;

        System.out.println("=========================================");
        System.out.println("|           Indice de Poluição          |");
        System.out.println("=========================================");

        while (loop){

            System.out.print("\nDigite o indice de poluição entre 0.0 e 0.5: ");
            indice = entrada.nextDouble();

            if (indice < 0.05){
                System.out.println("----------------------------------------");
                System.out.println("    Caraiiii, Toppp, ta limpin!!!!      ");
                System.out.println("----------------------------------------");
            }else if(indice < 0.25) {
                System.out.println("----------------------------------------");
                System.out.println("    Indice de poluição aceitável!!!!    ");
                System.out.println("----------------------------------------");
            }else if((indice > 0.25)&&(indice <= 0.3)){
                System.out.println("----------------------------------------------------");
                System.out.println("                Industrias do grupo 1               ");
                System.out.println("    Estão intimadas a suspenderem suas atividades   ");
                System.out.println("----------------------------------------------------");
            }else if ((indice > 0.3)&&(indice <= 0.4)){
                System.out.println("----------------------------------------------------");
                System.out.println("              Industrias do grupo 1 e 2             ");
                System.out.println("    Estão intimadas a suspenderem suas atividades   ");
                System.out.println("----------------------------------------------------");
            } else if((indice > 0.4)&&(indice <= 0.5)){
                System.out.println("----------------------------------------------------");
                System.out.println("           Todos os Grupos de Industrias            ");
                System.out.println("    Estão intimados a suspenderem suas atividades   ");
                System.out.println("----------------------------------------------------");
            }else {
                System.out.println("-----------------------------------------------------");
                System.out.println("    Ta de Sacanagem!!!! Planeta vai explodir Pô!!!   ");
                System.out.println("-----------------------------------------------------");
            }

            System.out.println("--------------------------------");


            System.out.print("\nDeseja encerrar o programa[S/n]: ");
            status = entrada.next().toUpperCase(Locale.ROOT);
            if (status.equals("S")){
                loop = false;
            }
        }

        System.out.println("\n");
        System.out.println("=====================");
        System.out.println("|  Fim da Execução  |");
        System.out.println("=====================");

    }
}
