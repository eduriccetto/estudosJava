package br.com.abc.introducao.javaCore.introducao.ClassesTest;

import br.com.abc.introducao.javaCore.introducao.Classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro hb20 = new Carro();
        hb20.modelo = "hb20";
        hb20.placa = "FIJ6J27";
        hb20.velocidadeMaxima = 120f;

        for (int i = 0; i < 3; i++){
            if (i == 0){
                System.out.println(hb20.modelo);
            }else if (i == 1){
                System.out.println(hb20.placa);
            }else {
                System.out.println(hb20.velocidadeMaxima);
            }
        }
    }

}
