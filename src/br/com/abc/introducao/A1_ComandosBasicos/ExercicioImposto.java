package br.com.abc.introducao.A1_ComandosBasicos;

/***
 * Crie uma variavel salario e imprima o seu imposto:
 *
 * salario < 1000 = 5%
 * salario >= 1000 && salario < 2000 = 10%
 * salario >= 2000 && salario < 4000 = 15%
 * salario > 5000 = 20%
 */

public class ExercicioImposto {
    public static void main(String[] args) {
        int salario = 4100;
        int imposto;
        int salario2;

        if (salario < 1000) {
            imposto = (salario * 5) / 100;
            salario2 = salario - imposto;
            System.out.println("Seu salario é de " + salario + " e com um imposto de 5% no valor de " + imposto + " você vai receber " + salario2);
        }else if (salario >= 1000 && salario < 2000) {
            imposto = (salario * 10) / 100;
            salario2 = salario - imposto;
            System.out.println("Seu salario é de " + salario + " e com um imposto de 10% no valor de " + imposto + " você vai receber " + salario2);
        }else if (salario >= 2000 && salario < 4000) {
            imposto = (salario * 15) / 100;
            salario2 = salario - imposto;
            System.out.println("Seu salario é de " + salario + " e com um imposto de 15% no valor de " + imposto + " você vai receber " + salario2);
        }else if (salario > 5000){
            imposto = (salario * 20) / 100;
            salario2 = salario - imposto;
            System.out.println("Seu salario é de " + salario + " e com um imposto de 20% no valor de " + imposto + " você vai receber " + salario2);
        }else {
            System.out.println("ta ganhando entre 4000 e 5000, ta bem heim fiii");
        }
    }
}
