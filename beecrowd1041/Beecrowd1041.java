import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Beecrowd1041{

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] valores = br.readLine().split(" ");

        float x = Float.parseFloat(valores[0]);
        float y = Float.parseFloat(valores[1]);

        if(x == 0.0f && y == 0.0f) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }         
    }
}