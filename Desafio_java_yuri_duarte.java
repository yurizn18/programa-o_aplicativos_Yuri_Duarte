/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio_java_yuri_duarte;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Desafio_java_yuri_duarte {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int opcao;
        double saldo_atual=100.00;
        double saldo_dolar=00.00,deposito,saldo;
        String[]descricao=new String[10];
        Double []valores=new Double[10];
         int indiceExtrato = 0;
   
        
        do{
            System.out.println("-------Menu Bancario----");
            System.out.println("1-Saldo");
            System.out.println("2-Deposito");
            System.out.println("3-Extrato");
            System.out.println("4-Simular Emprestimo");
            System.out.println("5-Comprar Dolar");
            System.out.print("0-Sair");
            
            System.out.print("escolha uma opcao");
              opcao=entrada.nextInt();
              
              switch (opcao) {
            case 1:
               System.out.println("saldo atual"+"R$"+ saldo_atual);
              System.out.print("Saldo em dolar US$: " + saldo_dolar);
                break;
                
            case 2:
                System.out.print("digite o valor do deposito");
                deposito=entrada.nextDouble();
                if (deposito>=0 && deposito<5000.00){
                    saldo+=deposito;
                    
                    if (indiceExtrato < 10) {
                            descricao[indiceExtrato] = "Depósito";
                            valores[indiceExtrato] = deposito;
                            indiceExtrato++;
                        } else {
                            for (int i = 1; i < 10; i++) {
                                descricao[i - 1] = descricao[i];
                                valores[i - 1] = valores[i];
                            }
                            descricao[9] = "Depósito";
                            valores[9] = deposito;
                        }

                   System.out.print("deposito realizado coom sucesso");
                   System.out.print("seu saldo agora é :"+saldo);
                   
                    
                }
                   
                    
                 else{
                        System.out.print("valor invalido digite o saldo novamente");
                         deposito=entrada.nextDouble();
                        }
                break;
                
            case 3:
                 
                System.out.println("Extrato (últimas movimentações):");
                    if (indiceExtrato == 0) {
                        System.out.println("Nenhuma movimentação registrada.");
                    } else {
                        for (int i = 0; i < indiceExtrato; i++) {
                            System.out.println((i+1) + " - " + descricao[i] + ": R$ " + valores[i]);
                        }
                    }
                    break;
                    
                
                
                
              
              
            
            
            
            
            
            
            
           
        }
    }
    
}
