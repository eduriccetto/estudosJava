package br.com.abc.introducao.A13_Interfaces.classes;
// como boa prática procure terminar o nome de uma interface com um advérbio
// em uma interface todos os métodos são abstratos, não se pode criar métodos concretos
// o que significa que seu método termina em ponto e virgula e não se abre chaves
public interface Tributavel {
    // atributo
    public static final double IMPOSTO = 0.2; // uma interface pode ter atributos, mas todos eles serão
                                             // considerados como uma constante

    // Métodos
    public void calcularImposto();

}
