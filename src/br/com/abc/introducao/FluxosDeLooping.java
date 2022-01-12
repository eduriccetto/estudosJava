package br.com.abc.introducao;

public class FluxosDeLooping {

    public static void main(String[] args) {

        int n = 0;
        int n2 = 0;

        while (n <= 10){
            System.out.println(n + " pelo While!");
            n += 1;
        }

        System.out.println("#############################");

        do{
            System.out.println(n2 + " pelo Do While!");
            n2 += 1;
        }while (n2 <= 10);

        System.out.println("#############################");

        for (int i = 0; i <= 10; i++){
            System.out.println(i + " pelo For!");
        }

    }

}
