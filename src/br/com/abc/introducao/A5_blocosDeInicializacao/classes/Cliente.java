package br.com.abc.introducao.A5_blocosDeInicializacao.classes;

public class Cliente {

    //          Etapas de processamento da JVM
    // 1 - Alocado espaço na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado

    private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private static int[] parcelas2;


    static {
        parcelas2 = new int[100];
        System.out.println("Dentro do bloco");  // Bloco construtor é apenas a abertura e fechamento de {}
        for (int i=1; i<=100; i++){
            parcelas2[i-1] = i;
            System.out.print(i + " ");
        }
        System.out.println("");
    }                              // mas a IDE me indicou a colocar este static

    public Cliente(){
        System.out.println("Dentro do construtor");
        for (int parcela: this.parcelas){
            System.out.print(parcela + " ");
        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

    public int[] getParcelas2() {
        return parcelas2;
    }

    public void setParcelas2(int[] parcelas2) {
        Cliente.parcelas2 = parcelas2;
    }
}
