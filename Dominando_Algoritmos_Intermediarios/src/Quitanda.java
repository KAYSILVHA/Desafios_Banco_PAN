import java.util.*;

public class Quitanda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double kiloconjunto = macas + morangos;
        double valuemorangosemdesconto = morangos * 2.5d;
        double valuemacassemdesconto = macas * 1.8d;

        double resultadosemdesconto = valuemacassemdesconto+ valuemorangosemdesconto;

        double valuemorangodesconto = morangos * 2.2d;
        double valuemacasdesconto = macas * 1.5d;
        double resultadocomdesconto = valuemacasdesconto + valuemorangodesconto;


//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
        if(morangos <5 && macas <5){
            System.out.println(resultadosemdesconto);
        }



        else if (morangos>=5 && macas >=5){
            if(kiloconjunto > 8 || resultadosemdesconto > 25d){
                double resultado = resultadosemdesconto - (resultadosemdesconto*10)/100;
                System.out.println(resultado);
            }else {
                System.out.println(resultadocomdesconto);
            }


        }

    }

}