package beecrowd1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int duracao = sc.nextInt();
        sc.close();

        int HORAEMSEG = 3600;
        int MINEMSEG = 60;
        int hora, min, seg = 0;

        if(duracao >= 3600) {
            hora = duracao / HORAEMSEG;
            duracao = duracao % HORAEMSEG;
        } else {
            hora = 0;
        }

        if(duracao > MINEMSEG) {
            min = duracao / MINEMSEG;
            duracao = duracao % MINEMSEG;
        } else {
            min = 0;
        }

        if(duracao < MINEMSEG) {
            seg = duracao;
        }

        System.out.printf("%d:%d:%d%n", hora, min, seg);
    }   
    
}
