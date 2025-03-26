
package javaapplication3;
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args){
     Scanner Ler = new Scanner(System.in);
        double [] temperaturas = new double[3];
        /* [0] - celsius
           [1] - Farenhit
           [] 
        */
        
        System.out.print("Digite a Temperatura em Gruas Celsius: ");
        temperaturas[0] = Ler.nextDouble();
        temperaturas[1] = temperaturas[0]*1.8 +32;
        
        System.out.println("[ ] Temperatura em Celsius: " 
                + temperaturas[0] + "[ ] Temperatura em Fahrenheit: " + temperaturas[1]);
    }
}
