import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beecrowd1044 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int[] valores = new int[input.length];
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a == 0 || b == 0) {
            System.out.println("Sao Multiplos");
        } else if((a % b) == 0 || (b % a) == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }        
    }
}