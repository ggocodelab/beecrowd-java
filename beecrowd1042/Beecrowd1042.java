package beecrowd1042;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1042 {

    public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);
       String[] input = sc.nextLine().split(" ");
       sc.close();
       
       int[] valores = new int[input.length];
       int[] entrada = new int[input.length];

       for(int i = 0; i < input.length; i++){
            valores[i] = Integer.parseInt(input[i]);
            entrada[i] = Integer.parseInt(input[i]);
       }

       Arrays.sort(valores);


       for(int i = 0; i < valores.length; i++){
        System.out.println(valores[i]);
       }

       System.out.println();

       for(int i = 0; i < entrada.length; i++){
        System.out.println(entrada[i]);
       }      
    
    }    
}
