package beecrowd1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.close();

        int ANOEMDIAS = 365;
        int MESEMDIAS = 30;

        int ano = 0;
        int mes = 0; 
        int dia = 0;

        if (idade >= ANOEMDIAS) {
            ano = idade / ANOEMDIAS;
            idade = idade % ANOEMDIAS;
        } else {
            ano = 0;
        }

        if(idade >= MESEMDIAS){
            mes = idade / MESEMDIAS;
            idade = idade % MESEMDIAS;
        }

        if(idade <= MESEMDIAS){
            dia = idade;
        }

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, mes, dia);        
    }
    
}
