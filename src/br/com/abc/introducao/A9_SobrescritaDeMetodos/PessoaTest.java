package br.com.abc.introducao.A9_SobrescritaDeMetodos;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        p.setIdade(16);

// sobrescrevendo o método "public String toString()" lá na classe pessoa, podemos chamar a impreção
//  somente com o System.out.println(p);
        System.out.println(p);

    }
}
