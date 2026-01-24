package beecrowd1038;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] separaValores = input.split(" ");
        int codigo = Integer.parseInt(separaValores[0]);
        int quantidade = Integer.parseInt(separaValores[1]);

        int[] codigos = {1, 2, 3, 4, 5};
        double[] valores = {4.0, 4.5, 5.0, 2.0, 1.5};

        for (int i = 0; i < codigos.length && i < valores.length; i++){
            if(codigo == codigos[i]){
                double total = quantidade * valores[i];
                System.out.printf("Total: R$ %.2f%n", total);
            }
        }
    }    
}
