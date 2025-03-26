package javaapplication3;
import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args){
    Scanner Ler = new Scanner(System.in);
    double [] Moedas = new double[4];
    /*  [0] - Real
        [1] - Euro
        [2] - Dola (EUA)
        [3] - Libra*/
    System.out.println("{ --- CONVERSOR --- \n[1] - Euro \n[2] - Dolar(EUA) \n[3] - Libra --- }");
    byte opcao = Ler.nextByte();
    switch(opcao){
        case 1: System.out.println("{---- Digite o Valor em Real: R$ -----}"); 
        Moedas[0] = Ler.nextDouble();
        Moedas[1] = Moedas[0]*6;
            System.out.println("------------- \n Valor Inicial: " + Moedas[0] 
                    + "\nValor Convertido: " + Moedas[1] + "\n-------------");
        break;
        case 2: System.out.println("{---- Digite o Valor em Real: R$ -----}"); 
        Moedas[0] = Ler.nextDouble();
        Moedas[2] = Moedas[0]*5.73;
            System.out.println("------------- \n Valor Inicial: " + Moedas[0] 
                    + "\nValor Convertido: " + Moedas[1] + "\n-------------"); 
        break;
        case 3: System.out.println("{---- Digite o Valor em Real: R$ -----}"); 
        Moedas[0] = Ler.nextDouble();
        Moedas[3] = Moedas[0]*7.3;
            System.out.println("------------- \n Valor Inicial: " + Moedas[0] 
                    + "\nValor Convertido: " + Moedas[1] + "\n-------------"); 
        break; } 
    }
}
