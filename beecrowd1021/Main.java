package beecrowd1021;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        sc.close();      
        
       String texto = " nota(s) de R$ ";
        double[] notasMoedasD = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        
        List<Integer> centavos = new ArrayList<>();
        
        List<Integer> itens = new ArrayList<>();
        
//      --------------- CONVERSÃO DE VALORES ----------------
        
        int valor = (int) Math.round(input * 100);
        
        for(int i = 0; i < notasMoedasD.length; i++) {
        	double m = notasMoedasD[i] * 100;
        	centavos.add((int) m);        	
        }
        
//       ---------------- CÁLCULO ----------------------
        for(int i = 0; i < centavos.size(); i++) {
        	if(valor >= centavos.get(i)) {
        		int n = valor / centavos.get(i);
        		itens.add(n);
        		valor %= centavos.get(i);
        	}else {
        		itens.add(0);
        	}
        }
        
//      ---------------- EXIBIÇÃO ----------------------
        String tipo = "nota";
        System.out.println("NOTAS:");
        for(int i = 0; i < itens.size() && i < notasMoedasD.length; i++) {
        	if(notasMoedasD[i] == 1) {
        		System.out.println("MOEDAS:");
        	}
        	
        	if(notasMoedasD[i] <= 1) {
        		tipo = "moeda";
        	}
        	
        	System.out.printf("%d %s(s) de R$ %.2f%n", itens.get(i), tipo, notasMoedasD[i]);        	
        }   
    }    
}

