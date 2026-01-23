package beecrowd1036;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1036 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] valores = input.split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);
        double raiz1 = 0.0;
        double raiz2 = 0.0;

        double delta = (b * b) - (4 * (a) * (c));

        if((delta > -1) && (a != 0)) {
            raiz1 = (-(b) + Math.sqrt(delta)) / (2 * (a));
            raiz2 = (-(b) - Math.sqrt(delta)) / (2 * (a));
            System.out.printf("R1 = %.5f%n", raiz1);
            System.out.printf("R2 = %.5f%n", raiz2);
        }else {
            System.out.println("Impossivel calcular");
        };            
    }    
}
