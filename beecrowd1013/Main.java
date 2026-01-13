package beecrowd1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String valores = sc.nextLine();

        String[] valores_separados = valores.split(" ");
        int a = Integer.parseInt(valores_separados[0]);
        int b = Integer.parseInt(valores_separados[1]);
        int c = Integer.parseInt(valores_separados[2]);

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB > c) ? maiorAB : c;

        System.out.println(maiorABC + " eh o maior");

        sc.close();        
    }
    
}
