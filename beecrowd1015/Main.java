package beecrowd1015;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String v1 = sc.nextLine();
        String v2 = sc.nextLine();

        String[] intevalo1 = v1.split(" ");
        String[] intervalo2 = v2.split(" ");

        double x1 = Double.parseDouble(intevalo1[0]);
        double x2 = Double.parseDouble(intervalo2[0]);
        double y1 = Double.parseDouble(intevalo1[1]);
        double y2 = Double.parseDouble(intervalo2[1]);

        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.printf("%.4f%n",distancia);

        sc.close();
    }
    
}
