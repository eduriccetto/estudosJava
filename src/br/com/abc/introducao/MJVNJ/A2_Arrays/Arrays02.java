package br.com.abc.introducao.MJVNJ.A2_Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // por padrão valores imprimios por:
        //   byte, short, int, long, float e double  =  0
        //   char = imprime unicode que representa um espaço em brando (' ') assim
        //   boolean vai imprimir = false
        //   String vai imprimir = null

        int[] idades = new int[3];
        //    mesmo não tendo adicionado valores de inicialização para cada endereço da memória
        //  vai imprimir os seus valores padrões.
        System.out.println(idades[0]);
        System.out.println(idades[1]);   // como exemplos destes 3 prints, estara imprimindo o valor "0"
        System.out.println(idades[2]);

        String[] nome = new String[1];
        System.out.println(nome[0]);    // como padrão imprime null

        char[] nome2 = new char[1];
        System.out.println(nome2[0]);    // como padrão imprime unicode de espaço em branco

        boolean[] test = new boolean[1];
        System.out.println(test[0]);     // como padrão imprime false

    }
}
