package javaapplication3;
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double[] desconto = new double[4];
        double preco;
        /*  [0] - Ler desconto 
            [1] - Calc desconto
            [2] - */
        System.out.print("---- [ ] Preco do Produto: ");
        preco = Ler.nextDouble();
        System.out.print("---- [ ] Qual o Desconto: ");
        desconto[0] = Ler.nextDouble();

        /* CALC */
        desconto[1] = preco * (desconto[0] / 100);
        System.out.println("---- [" + desconto[1] + "]");
    }
}
