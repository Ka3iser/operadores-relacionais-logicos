package estruturacondicional;

public class CondicaoTernaria {
    public static void main(String[] args){

        String palavra = "Sucesso";

        if (palavra.equals("Sucesso")){
            System.out.println("Parabéns você venceu!");
        } else{
            System.out.println("Sinto muito, não foi dessa vez!");
        }

        String palavraRetornada = palavra.equals("Sucesso") ? "parabéns você venceu" : "sinto muito, não foi dessa vez!";

        System.out.println(palavraRetornada);

        int numero = 27;
        int resultado = numero > 25 ? numero : 0;

        System.out.println(resultado);
    }
}

