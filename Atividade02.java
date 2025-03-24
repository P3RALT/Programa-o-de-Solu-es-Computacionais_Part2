
package javaapplication3;
import java.util.Scanner;
public class Atividade02 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int anos;
        long Segundos;
        long Calc; 
        System.out.print("Digite Quantidade de Anos: ");
        anos = Ler.nextInt();
        Calc = 365*24*60*60; 
        Segundos = anos*Calc;
        
        System.out.println("----- " + anos + " -----\n" + "-> Segundos: " + Segundos);
        
    }
    
}
