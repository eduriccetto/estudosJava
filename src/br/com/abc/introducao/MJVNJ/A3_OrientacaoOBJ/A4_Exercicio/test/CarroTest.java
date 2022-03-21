package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A4_Exercicio.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A4_Exercicio.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "HB20";
        carro1.modelo = "Hach";
        carro1.ano = 2022;

        carro2.nome = "Virtus";
        carro2.modelo = "Sedan";
        carro2.ano = 2021;

        System.out.println("\nCarro 1: ");
        System.out.println("Nome: "+carro1.nome);
        System.out.println("Modelo: "+carro1.modelo);
        System.out.println("Ano: "+carro1.ano);

        System.out.println("\nCarro 2: ");
        System.out.println("Nome: "+carro2.nome);
        System.out.println("Modelo: "+carro2.modelo);
        System.out.println("Ano: "+carro2.ano);

    }
}
