package br.com.abc.introducao;

public class Array {

    public static void main(String[] args) {
//                                                     todo array é considerado um objeto
        int[] idade = new int[7];
        idade[0] = 18;
        idade[1] = 16;
        idade[2] = 15;
        idade[3] = 22;
        idade[4] = 31;
        idade[5] = 42;
        idade[6] = 7;

        for (int i = 0; i < idade.length; i++){
            System.out.println(idade[i]);
        }

        //#################################################
        System.out.println("######################################");

//                                                       array multidimensional objeto

                                                          // este é o resultado esperado
        int [][] dias = new int[2][2];                      //[I@3fee733d      isto representa o local de memória
        dias[0][0] = 30;                                    //30
        dias[0][1] = 31;                                    //31
        dias[1][0] = 29;                                    //[I@5acf9800
        dias[1][1] = 28;                                    //29
                                                            //28
        for (int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
    }

}
