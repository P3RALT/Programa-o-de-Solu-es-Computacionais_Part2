/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_lista1;
import java.util.Scanner;
public class Atividade_Lista1 {
    public static void main(String[] args) {
       Scanner Ler = new Scanner(System.in);
       String nomeUsua;
       double pagamento;
       double [] boletos = new double[5];
       double salarioBruto, salarioLiquido;
       double desconto;
       
        System.out.print("Qual Seu Nome? ");
        nomeUsua = Ler.next();
        System.out.print("Qual seu Salario Bruto: R$ ");
        salarioBruto = Ler.nextDouble();
        desconto = salarioBruto*0.14;
        salarioLiquido = salarioBruto - desconto;
        
        System.out.println("{ --- "+ nomeUsua+" --- }" + "\nSalario Liquido: " 
                + salarioLiquido + "\nSalario Bruto: " + salarioBruto);
        System.out.print("Qual o valor dos Boletos: R$ ");
        boletos[0] = Ler.nextDouble();
        System.out.print("R$: ");
        boletos[1] = Ler.nextDouble();
        System.out.print("R$: ");
        boletos[2] = Ler.nextDouble();
        System.out.print("R$: ");
        boletos[3] = Ler.nextDouble();
        boletos[4] = boletos[0]+boletos[1]+boletos[2]+boletos[3]+boletos[4];
        
        System.out.println("{ ----- " + nomeUsua + "----- }" 
                + "\n[ 1 ] - Boleto 01: " + boletos[0] + "\n[ 2 ] - Boleto 02: " + boletos[1] + 
                "\n[ 3 ] - Boleto 03: " + boletos[2] +  "\n[ 4 ] - Boleto 04: " +  boletos[3]
                + "\n----------------" + "\n- Total: R$ " + boletos[4]);
        System.out.println("( 1 ) - Pagar ");
        byte opcao = Ler.nextByte();
        
        switch(opcao){
            case 1:
                System.out.print("Digitar o valor do Pagamento: ");
                pagamento = Ler.nextDouble();
                    if(pagamento > salarioLiquido){
                          System.out.println("Saldo Insuficiente");
                    } else {
                    double calcula = boletos[4]-pagamento;
                    System.out.println(" ----- PAGAMENTO ACEITO ---- "
                        + "\n- Pago: " + pagamento 
                        + "\n- Divida: " + calcula); }
                break;
        
        }  } }
