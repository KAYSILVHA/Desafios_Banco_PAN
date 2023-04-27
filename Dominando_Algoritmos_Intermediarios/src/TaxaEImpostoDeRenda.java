import java.io.IOException;
import java.util.Scanner;

public class TaxaEImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        double salary = read.nextDouble();
        read.close();

        double[] tax = {0.0,0.0,0.0};
        double[] height = {0.28,0.18,0.08};
        double[] value = {4500.00,3000.00,2000.00};

        if (salary > 2000.00) {
            for (int i = 0; i<value.length; ++i) {
                if (salary > value[i]) {
                    tax[2] = salary - (value[i] + tax[1]);
                    tax[0] += tax[2]*height[i];
                    tax[1] += tax[2];
                }
            }
        }
        System.out.println( (salary > 2000.00 ? String.format("R$ %.2f", tax[0]) : "Isento"));
    }
}