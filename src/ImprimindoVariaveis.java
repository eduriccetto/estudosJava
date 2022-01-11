public class ImprimindoVariaveis {
    public static void main(String[] args) {
        int idade = 17;
        String status;

        if (idade >= 18) {
            System.out.println("Sua idade é: " + idade + " e você já pode beber.");
        }else {
            System.out.println("Sua idade é só: " + idade + " cai fora bebe");
        }

        if (idade <18) {
            System.out.println("Bora tomar um todinho bebe!");
        }

        status = idade < 18 ? "Dá não, é pedofilia" : idade >= 18 && idade < 30 ? "Bora pegar essas cachorra" : "É das coroa que eu gosto";

        System.out.println(status);

    }
}
