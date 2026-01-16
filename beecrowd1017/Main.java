import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double GASTO = 12.0;

        double combustivel = (velocidade / GASTO) * tempo;

        System.out.printf("%.3f%n", combustivel);

        sc.close();
    }
}