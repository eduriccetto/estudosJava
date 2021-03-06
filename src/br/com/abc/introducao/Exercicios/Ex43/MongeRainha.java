/*******************************************************************************
 * 43) Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
 * qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o
 * pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro
 * de xadrez, de tal forma que o primeiro quadro deveria conter apenas um grão e
 * os quadros subseqüentes, o dobro do quadro anterior. A rainha achou o trabalho
 * barato e pediu que o serviço fosse executado, sem se dar conta de que seria
 * impossível efetuar o pagamento. Faça um programa para calcular o número de
 * grãos que o monge esperava receber.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex43;

public class MongeRainha {
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("|        Monge e Rainha        |");
        System.out.println("================================");

        double graosCasa=1,casasTabuleiro=64;
        int graos=1;

        for(int x=1;x<casasTabuleiro;x++){
            graosCasa = graosCasa*2;
            graos +=graosCasa;
        }

        System.out.println("\nO quantidade de grãos é: "+graos);

    }
}
