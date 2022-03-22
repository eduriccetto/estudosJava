package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A11_Construtores.domain;

public class Anime {

    // Atributos
    private String name;
    private String tipo;
    private int episodios;
    private String genero;

    // Construtores
    public Anime(String name, String tipo, int episodios, String genero) {
        System.out.println("\nChamou dentro do construtor");
        this.name = name;           // O construtor é sempre o primeiro a ser inicializado
        this.tipo = tipo;        // ao utilizarmos o construtor delimitamos o que é obrigatório ser declarado
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){
        // podemos também fazer uma sobrecarga de construtores, onde neste caso criamos um construtor
        // fazio que permite não ser obrigatória a declaração dos atributos na declaração da variável
        System.out.println("Chamou dentro do construtor vazio");
    }

    // Metodos
    public void init(String name, String tipo, int episodios, String genero){
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void imprimi(){
        System.out.println("\n-------------------------");
        System.out.println("Nome: "+this.name);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episodios: "+this.episodios);
        System.out.println("Genero: "+this.genero);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return name;
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
