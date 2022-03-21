package br.com.abc.introducao.MJVNJ.A2_Arrays;

public class ArraysMuiltDimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrayBase: arrayInt){
            System.out.println("\n----------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }                               // está imprimindo valor "0" por padrão
        }                         // está imprimindo todas as 11 possições int[2], int[3] e int[6]

        //##################################



    }
}
