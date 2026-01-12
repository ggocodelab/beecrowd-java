package beecrowd1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salarioBase = sc.nextDouble();
        double vendasEfetuadas = sc.nextDouble();
        double COMISSAO = 0.15;

        double vendasMaisComissao =  salarioBase + (vendasEfetuadas * COMISSAO);

        System.out.printf("TOTAL = R$ %.2f%n", vendasMaisComissao);

        sc.close(); 
    }
    
}
