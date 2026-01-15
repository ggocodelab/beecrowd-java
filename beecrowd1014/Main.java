package beecrowd1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();

        double consumo_medio = x / y;

        System.out.printf("%.3f km/l%n", consumo_medio);

        sc.close();
    }
    
}
