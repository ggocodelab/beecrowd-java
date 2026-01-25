package beecrowd1040;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1040 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Float mediaMaisExame = 0.0f;
        
        String[] notasStr = input.trim().split("\\s+");

        float[] notas = new float[notasStr.length];

        for(int i = 0; i < notasStr.length; i++) {
            notas[i] = Float.parseFloat(notasStr[i]);
        }

        int[] pesos = {2, 3, 4, 1};

        Float somaNotasPesos = 0.0f;

        int somaPesos = 0;

        for(int i = 0; i < notas.length && i < pesos.length; i++){
            somaNotasPesos += notas[i] * pesos[i];           
            somaPesos += pesos[i];
        }
     
        float media = somaNotasPesos / somaPesos;

        System.out.printf("Media: %.1f%n", media);

        if(media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            Float notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            mediaMaisExame = (media + notaExame) / 2;
            if(mediaMaisExame >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                 System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaMaisExame);
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }     
        sc.close();      
    }    
}
