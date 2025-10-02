/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio_java_yuri_duarte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafio_java_yuri_duarte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner entrada= new Scanner(System.in);
         Random random = new Random();
             int opcao, salario_bruto, qtd_parcelas, numero_aleatorio;
        double saldo = 100.00;
        double saldo_dolar = 0.00, deposito, dolar_comprar;
        double valor_emprestimo = 0, calc_parcelas;
        String[] descricao = new String[10];
        Double[] valores = new Double[10];
        int indiceExtrato = 0;
        String protocolo;
        double custo_em_reais;

        do {
            System.out.println("-------Menu Bancario----");
            System.out.println("1-Saldo");
            System.out.println("2-Deposito");
            System.out.println("3-Extrato");
            System.out.println("4-Simular Emprestimo");
            System.out.println("5-Comprar Dolar");
            System.out.println("0-Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f ", saldo);
                    System.out.printf("Saldo em dólar: US$ %.2f ", saldo_dolar);
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    entrada.nextLine();
                    String voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = -1;
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    deposito = entrada.nextDouble();
                    if (deposito >= 0 && deposito < 5000.00) {
                        saldo += deposito;

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

                        System.out.print("Depósito realizado com sucesso. ");
                        System.out.printf("Seu saldo agora é: R$ %.2f ", saldo);

                    } else {
                        System.out.print("Valor inválido, digite o saldo novamente: ");
                        deposito = entrada.nextDouble();
                    }
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    entrada.nextLine();
                    voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = -1;
                    }
                    break;

                case 3:
                    System.out.println("Extrato (últimas movimentações):");
                    if (indiceExtrato == 0) {
                        System.out.println("Nenhuma movimentação registrada.");
                    } else {
                        for (int i = 0; i < indiceExtrato; i++) {
                            System.out.printf("%d - %s: R$ %.2f", (i + 1), descricao[i], valores[i]);
                        }
                    }
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    entrada.nextLine();
                    voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = -1;
                    }
                    break;

                case 4:
                    while (valor_emprestimo <= 2000.00 || valor_emprestimo >= 10000.00) {
                        System.out.print("Digite um valor válido (entre 2000 e 10000): ");
                        valor_emprestimo = entrada.nextDouble();
                    }

                    System.out.println("Valor aceito!");

                    System.out.print("Digite o valor do seu salário bruto: ");
                    salario_bruto = entrada.nextInt();
                    if (salario_bruto < 0) {
                        System.out.print("O valor do salário bruto deve ser maior que 0");
                        break;

                    } else {
                        System.out.print("Salário bruto aprovado. ");
                    }
                    System.out.print("Digite a quantidade de parcelas: 6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72: ");
                    qtd_parcelas = entrada.nextInt();

                    if (qtd_parcelas != 6 && qtd_parcelas != 12 && qtd_parcelas != 18 && qtd_parcelas != 24 &&
                            qtd_parcelas != 30 && qtd_parcelas != 36 && qtd_parcelas != 40 && qtd_parcelas != 48 &&
                            qtd_parcelas != 56 && qtd_parcelas != 60 && qtd_parcelas != 72) {
                        System.out.println("Quantidade de parcelas inválida!");
                        break;
                    } else {
                        System.out.println("Quantidade de parcelas válida: " + qtd_parcelas);
                    }

                    double valor_total_com_juros = valor_emprestimo * 1.02;
                    calc_parcelas = valor_total_com_juros / qtd_parcelas;

                    System.out.printf("Valor solicitado: R$ %.2f ", valor_emprestimo);
                    System.out.printf("Valor total com juros (2%%): R$ %.2f ", valor_total_com_juros);
                    System.out.printf("Valor de cada parcela: R$ %.2f ", calc_parcelas);

                    if (calc_parcelas <= 0.30 * salario_bruto) {
                        System.out.println("Empréstimo disponível! Entre em contato com a central e informe o número do protocolo.");
                        numero_aleatorio = random.nextInt(100000);
                        protocolo = "EM" + String.format("%05d", numero_aleatorio);
                        System.out.println("Número do protocolo: " + protocolo);
                    } else {
                        System.out.println("Empréstimo negado: o valor das parcelas ultrapassa 30% do seu salário bruto.");
                    }

                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    entrada.nextLine();
                    voltar = entrada.nextLine().toUpperCase();

                    if (voltar.equals("E")) {
                        opcao = -1;
                    }
                    break;

                case 5:
                    final double COTACAO = 5.32;
                    System.out.printf("Saldo disponível em Reais: R$ %.2f ", saldo);
                    System.out.print("Quantos dólares deseja comprar (US$)? ");
                    dolar_comprar = entrada.nextDouble();
                    entrada.nextLine();

                    custo_em_reais = dolar_comprar * COTACAO;
                    System.out.printf("Custo em Reais: R$ %.2f", custo_em_reais);

                    if (custo_em_reais > saldo) {
                        System.out.println("Seu saldo atual é insuficiente.");
                        System.out.print("Deseja simular novamente (R), voltar ao menu (V) ou encerrar o programa (E)? ");
                        String escolha = entrada.nextLine();
                        if (escolha.equals("E")) {
                            opcao = -1;
                        } else if (escolha.equals("R")) {
                        }
                    } else {
                        System.out.print("Confirmar compra? ('s' para confirmar, 'n' para cancelar): ");
                        String confirma = entrada.nextLine();

                        if (confirma.equals("s")) {
                            saldo -= custo_em_reais;
                            saldo_dolar += dolar_comprar;
                            System.out.println("Compra realizada com sucesso!");
                            System.out.printf("Novo saldo em Reais: R$ %.2f ", saldo);
                            System.out.printf("Novo saldo em Dólares: US$ %.2f ", saldo_dolar);
                            if (indiceExtrato < 10) {
                                descricao[indiceExtrato] = "Compra de dólares";
                                valores[indiceExtrato] = -custo_em_reais;
                                indiceExtrato++;
                            } else {
                                for (int i = 1; i < 10; i++) {
                                    descricao[i - 1] = descricao[i];
                                    valores[i - 1] = valores[i];
                                }
                                descricao[9] = "Compra de dólares";
                                valores[9] = -custo_em_reais;
                            }
                        } else {
                            System.out.println("Compra cancelada.");
                        }

                        System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                        String voltarCompra = entrada.nextLine();
                        if (voltarCompra.equals("E")) {
                            opcao = -1;
                        }
                    }
                    break;

                case 0:
                    System.out.print("Encerrando o atendimento. Obrigado por usar o caixa rápido.");
                    break;
            }
        } while (opcao != 0);
       
    }
    
}
