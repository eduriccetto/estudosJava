package br.com.abc.introducao.Exercicios.Ex01;

import java.util.Objects;
import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {

//        String[] nome = new String[10];
        String[] sexo = new String[10];
        int[] idade = new int[10];
        int[] idadeHomen = new int[10];

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        while (contador != 5){

//            System.out.print("Digite seu nome: ");
//            nome[contador] = entrada.next().toUpperCase(Locale.ROOT);
            System.out.print("Digite seu sexo [M/F]: ");
            sexo[contador] = entrada.next().toUpperCase();
            if (Objects.equals(sexo[contador], "M")){
                System.out.print("Digite sua idade: ");
                idadeHomen[contador] = entrada.nextInt();
                idade[contador] = idadeHomen[contador] ;
            }
            if (Objects.equals(sexo[contador], "F")){
                System.out.print("Digite sua idade: ");
                idade[contador] = entrada.nextInt();
            }
            System.out.println("-------------------------------\n");

            contador += 1;
        }

        System.out.println("=========================================================\n\n\n");

        // ============   Maior idade  ======================================================================
        int maiorIdade = 0;
        for (int s : idade) {
            if (s > maiorIdade){
                maiorIdade = s;
            }
        }

        System.out.println("A maior idade do grupo é: " + maiorIdade);

        // ============   Menor idade  ======================================================================
        int menorIdade = 10000;
        for (int s : idade) {
            if (s == 0){
                break;
            }
            if (s < menorIdade){
                menorIdade = s;
            }
        }

        System.out.println("A menor idade do grupo é: " + menorIdade);

        // ============    Média de idade dos homens  ======================================================
        int mediaIdadeHomen = 0;
        int qtdHomen = 0;
        for (int s : idadeHomen) {
            if (s != 0){
                mediaIdadeHomen = mediaIdadeHomen + s;
                qtdHomen += 1;
            }
        }

        System.out.println("A média de idade dos homens do grupo é: " + (mediaIdadeHomen / qtdHomen));

        // ============   Número de mulheres  ==============================================================
        int numeroMulher = 0;
        for (String s : sexo) {
            if (Objects.equals(s, "F")){
                numeroMulher += 1;
            }
        }

        System.out.println("A número de mulheres no grupo é: " + numeroMulher);

        //======================================================================================








//        contador = 0;
//        while (contador != 10){
//            System.out.println("Olá " + nome[contador] + "! Seu sexo é " + sexo[contador] +
//                    " e sua idade é " + idade[contador]);
//            System.out.println("-----------------------------------");
//
//            contador += 1;
//        }

    }
}
