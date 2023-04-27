import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

        if (A > B && A > C) maior = A;
        else if (B > C) maior = B;
        else maior = C;

        if (maior == A) soma = B + C;
        else if (maior == B) soma = A + C;
        else soma = B + A;

        if (soma > maior) triangulo = true;
        else triangulo = false;

        if (triangulo) {
            var perimetro = A + B + C; //complete com a sua lógica
            System.out.println("Perimetro = " + perimetro);
        } else {
            var areaTrapezio = ((A + B) * C) / 2;  //complete com a sua lógica
            System.out.println("Area = " + areaTrapezio);
        }
    }
}
 