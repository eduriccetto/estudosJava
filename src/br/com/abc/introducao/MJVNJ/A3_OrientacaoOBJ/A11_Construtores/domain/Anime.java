package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A11_Construtores.domain;

public class Anime {

    // Atributos
    private String name;
    private String tipo;
    private int episodios;
    private String genero;
    private String canal;

    // Construtores
    public Anime(String name, String tipo, int episodios, String genero) {
        this(); // existe a sobrecarga de construtores
        // Com este this(); chamamos para dentro deste construtor, o construtor vazio abaixo
        // Dentro dos parametros do this() podemos passar os valores de construtores para um cod mais limpo
        //
        //  Assim como exemplo:
        //
        //   public Anime(String outracoisa, String outracoisa2, String outracoisa3){
        //       this(String name, String tipo, int episodios, String genero);
        //       this.outracoisa = outracoisa;
        //       this.outracoisa2 = outracoisa2;
        //       this.outracoisa3 = outracoisa3;
        //   }
        //
        System.out.println("\nChamou dentro do construtor");
        this.name = name;           // O construtor é sempre o primeiro a ser inicializado
        this.tipo = tipo;        // ao utilizarmos o construtor delimitamos o que é obrigatório ser declarado
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String name, String tipo, int episodios, String genero, String canal){
        this(name, tipo, episodios, genero);
        this.canal = canal;
    }

    public Anime(){
        // podemos também fazer uma sobrecarga de construtores, onde neste caso criamos um construtor
        // fazio que permite não ser obrigatória a declaração dos atributos na declaração da variável
        System.out.println("Chamou dentro do construtor vazio");
    }


    // Metodos
    public void init(String name, String tipo, int episodios, String genero, String canal){
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.canal = canal;
    }

    public void imprimi(){
        System.out.println("\n-------------------------");
        System.out.println("Nome: "+this.name);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episodios: "+this.episodios);
        System.out.println("Genero: "+this.genero);
        System.out.println("Canal: "+this.canal);
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

    public void setCanal(String canal) { this.canal = canal; }

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

    public String getCanal() { return canal; }
}
