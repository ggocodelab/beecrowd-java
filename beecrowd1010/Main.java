package beecrowd1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String peca1 = sc.nextLine();
        String peca2 = sc.nextLine();

        String[] p1 = peca1.split(" ");
        String[] p2 = peca2.split(" ");

        int p1_cod = Integer.parseInt(p1[0]);
        int p1_num_pecas = Integer.parseInt(p1[1]);
        double p1_valor_unit = Double.parseDouble(p1[2]);

        int p2_cod = Integer.parseInt(p2[0]);
        int p2_num_pecas = Integer.parseInt(p2[1]);
        double p2_valor_unit = Double.parseDouble(p2[2]);

        double p1_valor = p1_num_pecas * p1_valor_unit;
        double p2_valor = p2_num_pecas * p2_valor_unit;

        double total = p1_valor + p2_valor;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
       
        sc.close();

    }
    
}
