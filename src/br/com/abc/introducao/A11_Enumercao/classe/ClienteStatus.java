package br.com.abc.introducao.A11_Enumercao.classe;

public class ClienteStatus {
    private String nome;
    private StatusCliente status;

    // Método

    @Override
    public String toString() {
        return "ClienteStatus{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }

    // Constructur
    public ClienteStatus(String nome, StatusCliente status) {
        this.nome = nome;
        this.status = status;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusCliente getStatus() {
        return status;
    }

    public void setStatus(StatusCliente status) {
        this.status = status;
    }
}
