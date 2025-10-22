package estruturacondicional;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args){

        //estruturas condicionais
        // if (se), else if (outra), else (se não)

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Seja muito bem vindo!");
        }
         else if (idade <= 10){
            System.out.println("sai daqui pirralho");
        }
         else {
            System.out.println("volte quando tiver pelo menos 18 anos.");
        }

    }

}
