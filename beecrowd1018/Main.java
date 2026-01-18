package beecrowd1018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int valor_inicial = valor;
        sc.close();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        List<Integer> notas = new ArrayList<>();

        for(int i = 0; i < cedulas.length; i++) {
            
            if(valor >= cedulas[i]){
                notas.add(valor / cedulas[i]);
                valor = valor % cedulas[i];
            } else {
                notas.add(0);
            }                            
        }
        System.out.println(valor_inicial);
        for(int i = 0; i < notas.size() && i < cedulas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d,00%n", notas.get(i), cedulas[i]);
        }
    }
    
}
