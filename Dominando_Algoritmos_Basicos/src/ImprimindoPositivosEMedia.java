import java.io.IOException;
import java.util.Scanner;

public class ImprimindoPositivosEMedia {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;
        double soma =0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i != 6; i++) {
            System.out.println();
            x = leitor.nextDouble();
            if (x >= 0){
                cont++;
                soma = x + soma;
            }


        }


        media = soma/cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}