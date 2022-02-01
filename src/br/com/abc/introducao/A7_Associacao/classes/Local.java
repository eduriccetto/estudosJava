package br.com.abc.introducao.A7_Associacao.classes;

public class Local {
    private String rua;
    private String bairro;

    // ==========================   Construtores

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }
    //===========================    Método

    public void print(){
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
    }

// ==========================    Getters and Setters


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
