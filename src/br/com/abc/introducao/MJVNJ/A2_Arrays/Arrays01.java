package br.com.abc.introducao.MJVNJ.A2_Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int [] idades = new int[3]; // com "new int[3]" definindo um array inteiro com espaço de 3 na memória
        System.out.println(idades); // ao imprimir o array vou ver um endereço de memória
        idades[0] = 1;
        idades[1] = 2;    // alocando um número a endereço de memória especifico do array
        idades[2] = 3;
        System.out.println(idades[0]);
        System.out.println(idades[1]);   //  Aqui imprimimos numeros alocados em cada endereço de memória.
        System.out.println(idades[2]);

    }
}
