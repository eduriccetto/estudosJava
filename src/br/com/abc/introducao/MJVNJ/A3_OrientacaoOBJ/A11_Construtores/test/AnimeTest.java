package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A11_Construtores.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A11_Construtores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime1 = new Anime("Pokemon", "TV", 128, "Aventura");
        // e neste caso já podemos declarar diretamenmte na declaração da variável


        Anime anime2 = new Anime();
        // aqui criamos um anime vazio, por causa daquele construtor que fizemos vazio, onde agora não é mais
        // obrigatorio a declaração como argumentos.

        anime2.init("Digimon", "TV", 125, "Aventura");

        Anime anime3 = new Anime();

        //anime1.init("Pokemon", "TV", 128, "Aventura");

        anime1.imprimi();
        anime2.imprimi();
        anime3.imprimi();
    }
}
