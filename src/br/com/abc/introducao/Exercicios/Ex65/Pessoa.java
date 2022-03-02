package br.com.abc.introducao.Exercicios.Ex65;

import java.util.Arrays;

public class Pessoa {

    private final String[] nome = new String[3];
    private final int[] idade = new int[3];
    private final String[] cargo = new String[3];
    private final double[] salario = new double[3];

    // Método
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=" + Arrays.toString(nome) +
                ", idade=" + Arrays.toString(idade) +
                ", cargo=" + Arrays.toString(cargo) +
                ", salario=" + Arrays.toString(salario) +
                '}';
    }

    // Contrutores
    public Pessoa() {
    }

    // Getters and Setters
    public String[] getNome(String nome) {
        return this.nome;
    }

    public int[] getIdade() {
        return idade;
    }

    public String[] getCargo() {
        return cargo;
    }

    public double[] getSalario() {
        return salario;
    }
}
