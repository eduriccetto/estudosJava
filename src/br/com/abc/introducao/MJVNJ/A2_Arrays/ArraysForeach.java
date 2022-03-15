package br.com.abc.introducao.MJVNJ.A2_Arrays;

public class ArraysForeach {
    public static void main(String[] args) {

        int[] numeros = new int[3]; // podemos declarar um array somente com espaço de memória

        int[] numeros2 = {1, 2, 3, 4, 5}; // podemos declarar um array já com conteúdo preenchido na memória
        // no caso aqui com 5 espaços de memória

        int[] numeros3 = new int[]{1,2,3,4,5,6}; // outra forma de declaração

        System.out.println("\n");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        //######################################################

        String[] nomes = {"Maria", "Pedro", "José"};

        System.out.println("\n");

        for(String x: nomes){            // este é o Foreach, uma versão simplificade de for
            System.out.println(x);       // colocando o tipo primitivo do array como parametro
        }                                // seguido de uma variavel local para o for, seguido dos dois pontos
                                         // e o nomme do array após os dois pontos
    }                      // esta variável de referencia X percorre todos os endereços de memória do array
}
