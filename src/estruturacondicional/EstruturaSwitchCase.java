package estruturacondicional;

import java.util.Scanner;

public class EstruturaSwitchCase {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7");
        int dia = scanner.nextInt();

        if(dia == 1){
            System.out.println("Segunda-feira");
        }else if(dia == 2){
            System.out.println("Terça-feira");
        } else if (dia ==3) {
            System.out.println("Quarta-feira");
        } else if (dia == 4) {
            System.out.println("Quinta-feira");
        }else if(dia == 5){
            System.out.println("Sexta-feira");
        }else {
            System.out.println("Sábado");
        }

        System.out.println("com switch");

        switch (dia){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("terça-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out.println("sábado");
                break;
            default:
                System.out.println("numero invalido");
        }
    }

}
