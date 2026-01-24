import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1037{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double input = sc.nextDouble();
        sc.close();
        
        if(input > 75 && input <= 100) {
            System.out.println("Intervalo (75,100]");
        } else if (input > 50 && input <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (input > 25 && input <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (input >= 0 && input <= 25) {
            System.out.println("Intervalo [0,25]");
        } else {
            System.out.println("Fora de intervalo");
        }       
    }
}