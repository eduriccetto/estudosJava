package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A12_BlocosDeInicializacao.domain;

public class Anime {

    private String nome;
    //private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    private int[] episodios;

    //                 ORDEM DE FUNCIONAMENTO
    // 1- Alocado espaço em memória para o objeto
    // 2- Cada atributo de classe é criado inicializado com valores default ou o que for passado.
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    static {
        System.out.println("Dentro do construtor");
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

        System.out.println(episodios);
        for(int episodios: this.episodios){
            System.out.print(episodios + " ");
            if(episodios == 50){
                System.out.println("");
            }
        }
    }
}
