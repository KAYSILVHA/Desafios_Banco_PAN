import java.util.Scanner;

public class ContaEspacosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
        //Dica: Você pode utilizar o Character.toLowerCase em sua condição:

        for (String item : strSplit) {
            for (int i = 0; i < item.length(); i++){
                char c = item.charAt(i);
                char cMinusculo = Character.toLowerCase(c);
                if (contem(arrVogais, cMinusculo))
                    quantVogais++;
            }
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }

    private static boolean contem (char vetor[], char comparacao){
        boolean flag = false;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == comparacao)
                flag = true;
        }

        return flag;
    }

}