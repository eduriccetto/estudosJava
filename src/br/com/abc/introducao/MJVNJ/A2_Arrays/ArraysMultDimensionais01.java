package br.com.abc.introducao.MJVNJ.A2_Arrays;

public class ArraysMultDimensionais01 {
    public static void main(String[] args) {

        // 1,2,3,4,5 Meses
        // 31,28,31,30 dias

        int[][] dias = new int[3][3];  // para linkar arrays multidimensionais acrescentamos estes dois novos []
        // podemos linkar várias posições como ex: "int[][][][][] dias = new int[12][][][][];" assim
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        System.out.println("\n\n");

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);          // aqui estou apenas imprimindo o endereço de memória 
        }                                       // do array que referencia os outros arrays

        System.out.println("\n======================\n");

        //  Imprimindo os valores do array

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("\n======================\n");

        // imprimindo array multimensional com foreach

        for(int[] arrayBase: dias){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }
        
    }
}
