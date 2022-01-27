package br.com.abc.introducao.A3_sobrecargaMetodos.test;


import br.com.abc.introducao.A3_sobrecargaMetodos.classes.Funcionarios;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.setNome("Paula");
        funcionarios.setCpf("333.222.111-20");
        funcionarios.setRg("46.963.745.6");
        funcionarios.setSalario(4500.67);
        funcionarios.setIdade(47);

        Funcionarios funcionarios1 = new Funcionarios();
        funcionarios1.cadastrar("Pedro", "999.888.777-23", "46.867.852.2", 7523.62);

        Funcionarios funcionarios2 = new Funcionarios();
        funcionarios2.cadastrar("Carlos", "384.567.589-55", "89.696.251-5", 3225.32, 28);

        funcionarios.print();
        funcionarios1.print();
        funcionarios2.print();
    }
}
