package beecrowd1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String valores = sc.nextLine();

        String[] separa_valores = valores.split(" ");

        double a = Double.parseDouble(separa_valores[0]);
        double b = Double.parseDouble(separa_valores[1]);
        double c = Double.parseDouble(separa_valores[2]);

        double area_triangulo_retangulo = (a * c) / 2;
        double area_circulo_raio_c = 3.14159 * Math.pow(c,2);
        double area_trapezio = ((a + b) * c)/2;
        double area_quadrado = b * b;
        double area_retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", area_triangulo_retangulo);
        System.out.printf("CIRCULO: %.3f%n", area_circulo_raio_c);
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);

        sc.close();
        
    }
    
}
