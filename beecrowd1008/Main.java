package beecrowd1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        int numFuncionario = sc.nextInt();
        int horas_trabalhadas = sc.nextInt();
        double valor_hora = sc.nextDouble();

        double salario = horas_trabalhadas * valor_hora;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numFuncionario, salario);


        sc.close();
    }
    
}
