package br.com.abc.introducao.A6_ModificadoresStatic.test;

import br.com.abc.introducao.A6_ModificadoresStatic.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro("UNO", 145);
        Carro carro2 = new Carro("BMW", 280);
        Carro carro3 = new Carro("AUDI", 275);
        Carro carro4 = new Carro("Mercedez", 290);

//        carro1.imprimi();
//        carro2.imprimi();
//        carro3.imprimi();
//        carro4.imprimi();

        System.out.println("###########################################################");

        if (carro1.getVelocidadeMaxima() < carro1.getGetVelocidadeLimite()){
            carro1.imprimi();
        }
        if (carro2.getVelocidadeMaxima() < carro2.getGetVelocidadeLimite()){
            carro2.imprimi();
        }
        if (carro3.getVelocidadeMaxima() < carro3.getGetVelocidadeLimite()){
            carro3.imprimi();
        }
        if (carro4.getVelocidadeMaxima() < carro4.getGetVelocidadeLimite()){
            carro4.imprimi();
        }

        System.out.println("###########################################################");

        carro1.setGetVelocidadeLimite(400); // Desta forma alteramos o valor do atributo de 240 para 400
                                           // e devido a metodo Static altera de toda a classe e não somente
                                          // do carro1 (um objeto) e sim de todos os carros (toda classe).
        // mas o correto é chamar a Classe Carro e não um obj em especifico (carro1) para não ter confusão

        if (carro1.getVelocidadeMaxima() < carro1.getGetVelocidadeLimite()){
            carro1.imprimi();
        }
        if (carro2.getVelocidadeMaxima() < carro2.getGetVelocidadeLimite()){
            carro2.imprimi();
        }
        if (carro3.getVelocidadeMaxima() < carro3.getGetVelocidadeLimite()){
            carro3.imprimi();
        }
        if (carro4.getVelocidadeMaxima() < carro4.getGetVelocidadeLimite()){
            carro4.imprimi();
        }

    }
}
