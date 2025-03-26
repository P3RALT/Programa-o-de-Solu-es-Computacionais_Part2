package javaapplication3;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        System.out.print("Quantos Produtos vc Comprou maria? ");
        int lista = Ler.nextInt();
        
        double [] precoProduto = new double[lista];
        String [] nomeProduto = new String[lista];
        double total = 0;
        double pago = 0;
        for(int i = 0; i < lista; i++){
        System.out.print("--- Carrinho --- \n Oq vc comprou? Digite o nome do Produto: ");
        nomeProduto[i] = Ler.next();
        Ler.nextLine();
      
        System.out.print("Preço - R$: ");
        precoProduto[i] = Ler.nextDouble();
        
        total += precoProduto[i];
        }
        
        System.out.println("\n--- Carrinho de Compras --- ");
        for (int i = 0; i < lista; i++) {
            System.out.println("Produto: " + nomeProduto[i] + " | Preço: R$ " + precoProduto[i]);
        }
        System.out.println("- Total da Compra: " + total);
        System.out.println(" ---- ---- Vai pagar quanto? ---------");
        pago = Ler.nextDouble();
        pago = total - pago;
                
        System.out.println("\n--- Carrinho de Compras --- ");
        for (int i = 0; i < lista; i++) {
        System.out.println("Produto: " + nomeProduto[i] + " | Preço: R$ " + precoProduto[i]);
        }
        System.out.println("- Total da Compra: " + total);
        System.out.println("- Troco: " + pago);
    }
}
