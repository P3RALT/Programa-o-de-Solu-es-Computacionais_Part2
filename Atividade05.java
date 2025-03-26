
package javaapplication3;
import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        double [] medidas = new double[3];
        /* [0] - Metros
           [1] - Polegadas
           [2] - Pes 
           []
        */
        System.out.print("Digite o Valor do Comprimento em Metros: ");
        medidas[0] = Ler.nextDouble();
        
        /* --- Calcullos --- */
        medidas[1] = medidas[0]*39.37;
        medidas[2] = medidas[0]*3.28;
        
        System.out.println("------ \n Metros: " + medidas[0]  + "\n Pes: " 
                + medidas[2] + "\n Polegadas: " + medidas[1]);
    }  
}

