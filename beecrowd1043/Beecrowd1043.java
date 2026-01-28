import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beecrowd1043 {

    public static void main(String[] args)  throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        String[] valores = br.readLine().split(" "); 
        
        float[] ladosTriangulo = new float[valores.length];
        for(int i = 0; i < valores.length; i++) {
            ladosTriangulo[i] = Float.parseFloat(valores[i]);
        }

        float a = ladosTriangulo[0];
        float b = ladosTriangulo[1];
        float c = ladosTriangulo[2];

        if((a + b) > c && (b + c) > a && (c + a) > b) {
            float perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);             
        } else {
            float areaTrapezioABC = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", areaTrapezioABC);
        }
    }
    
}
