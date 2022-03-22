package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A10_SobrecargaDeMetodos.domain;

public class Anime {

    // Atributos
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // Metodos
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero){  // sobrecarga de metodos é termos
                                                      // outros metods com mesmo nome mais parametros diferentes
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("\n---------------------------");
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }
}
