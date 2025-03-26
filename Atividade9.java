package javaapplication3;
import java.util.Scanner;
import java.util.Locale;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        // Numero de Comods
        int comodos = 0;
        System.out.print("{ --> Quantos comodos precisam ser calculados? ");
        comodos = ler.nextInt();
        
        double[] largura = new double[comodos];
        double[] comprimento = new double[comodos];
        double[] area = new double[comodos];
        
        // Loop Cada Comodo
        for (int i = 0; i < comodos; i++) {
            int indice = i; 
            System.out.println("{---- Comodo: " + indice + " ----}");
            System.out.print("-> Informe a largura: ");
            largura[i] = ler.nextDouble();
            
            ler.nextLine();

            System.out.print("-> Informe o comprimento: ");
            comprimento[i] = ler.nextDouble();
            
            area[i] = largura[i] * comprimento[i];
        }
        
        for (int i = 0; i < comodos; i++) {
            System.out.println("{ --- Comodo: " + i + " --- }"
                    + " < Largura: " + largura[i]
                    + " > < Comprimento: " + comprimento[i]
                    + " > < Area: " + area[i] + " >");
        }

    }
}
