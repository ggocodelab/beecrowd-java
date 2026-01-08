package beecrowd1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        final double N =  3.14159;

        double area = N * Math.pow(raio, 2); 

        System.out.printf("A=%.4f%n", area);


        sc.close();
    }
    
}
