package br.com.abc.introducao.Exercicios.Ex65;


import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] nome = new String[3];
        int[] idade = new int[3];
        String[] cargo = new String[3];
        double[] salario = new double[3];
        String n;
        double z;
        boolean loop = true;
        int y, cont = 0;

        System.out.println("=============================");
        System.out.println("   Cadastro de Funcionários  ");
        System.out.println("=============================");

        while (loop){
            System.out.println("\n");
            System.out.print("Digite o nome do funcionário: ");
            n = entrada.next().toUpperCase(Locale.ROOT);
            nome[cont] = n;

            System.out.print("Digite a idade do funcionário: ");
            y = entrada.nextInt();
            idade[cont] = y;

            System.out.print("Digite o cargo do funcionário: ");
            n = entrada.next().toUpperCase(Locale.ROOT);
            cargo[cont] = n;

            System.out.print("Digite o salario do funcionário: ");
            z = entrada.nextDouble();
            salario[cont] = z;

            cont ++;
            if (cont == 3){
                loop = false;
            }
        }

        System.out.println("\n");;
        System.out.println("===================================");
        for (int i = 0; i < nome.length; i++) {
            System.out.println("------------------------------------");
            System.out.println("Nome: "+ nome[i]);
            System.out.println("Idade: "+ idade[i]);
            System.out.println("Cargo: "+ cargo[i]);
            System.out.println("Salario: "+ salario[i]);
        }


    }
}
