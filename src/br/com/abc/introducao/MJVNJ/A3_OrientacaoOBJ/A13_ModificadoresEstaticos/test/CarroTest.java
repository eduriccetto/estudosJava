package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A13_ModificadoresEstaticos.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A13_ModificadoresEstaticos.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 =  new Carro("BMW", 280);
        Carro carro2 =  new Carro("Mercedes", 275);
        Carro carro3 =  new Carro("Audi", 290);

        //carro1.setVelocidadeLimite(180);

        Carro.velocidadeLimite = 120;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
