

public class Swich {

    public static void main(String[] args) {
        byte dia = 3;
        String diaSemana = "";
        // tipos que podem ir dentro de um Swich
        // char, int, byte, short, enum e String

        switch (dia) {

            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sabado";
                break;

        }

        if (dia == 7 || dia == 1){
            System.out.println(diaSemana + " não é um dia útil, borá toma uma!");
        }else {
            System.out.println(diaSemana + " é um dia útil, vai trabalhar!");
        }
    }

}
