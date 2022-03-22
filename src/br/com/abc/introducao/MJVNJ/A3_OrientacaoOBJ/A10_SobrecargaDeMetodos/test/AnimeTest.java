package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A10_SobrecargaDeMetodos.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A10_SobrecargaDeMetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();
        anime1.setNome("Akudama Drive");
        anime1.setTipo("TV");
        anime1.setEpisodios(12);
        anime1.setGenero("Ação");

        anime2.init("Pokemon", "TV", 98);
        anime2.setGenero("Aventura");

        anime3.init("Digimon", "TV", 125, "Aventura");

        anime1.imprime();
        anime2.imprime();
        anime3.imprime();

    }
}
