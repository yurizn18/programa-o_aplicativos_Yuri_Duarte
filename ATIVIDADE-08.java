/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodo_yuri_duarte;

import java.util.Scanner;

public class Metodo_yuri_duarte {

    // ==================== MÉTODOS DE CÁLCULO ====================
    // public int calcula_delta(int a,int b,int c){
    //     int calc=(Math.pow(b,2)-(4*a*c));
    //     return calc;
    // }

    //public int soma(int n1, int n2){
    //     return n1+n2;
    // }

    // public int subtracao(int a, int b){
    //     return a-b;
    // }

    // public int multiplicacao(int x, int y){
    //     return x*y;
    // }

    // public double divisao(double c, double d){
    //     return c/d;
    // }

    // ==================== MÉTODO NOME DO MÊS ====================
    // public String nomeMmês(int mes){
    //     switch(mes){
    //         case 1: return "janeiro";
    //         case 2: return "fevereiro";
    //         case 3: return "março";
    //         case 4: return "abril";
    //         case 5: return "maio";
    //         case 6: return "junho";
    //         case 7: return "julho";
    //         case 8: return "agosto";
    //         case 9: return "setembro";
    //         case 10: return "outubro";
    //         case 11: return "novembro";
    //         case 12: return "dezembro";
    //         default: return "Mês inválido";
    //     }
    // }
    
  //  public String nomeMesArray(int mes) {
    //    String[] nomes = {
      //      "Janeiro", "Fevereiro", "Março", "Abril",
        //    "Maio", "Junho", "Julho", "Agosto",
          //  "Setembro", "Outubro", "Novembro", "Dezembro"
       // };
       // if (mes >= 1 && mes <= 12) return nomes[mes - 1];
       // else return "Mês inválido";
   // }

    // ==================== MÉTODO SALÁRIO FUNCIONÁRIO ====================
 //   public void salarioFuncionario() {
  //      Scanner entrada = new Scanner(System.in);
   //     double media_salarial = 1500.00;
   //     double[] salario = new double[50];

   //     for (int i = 0; i < salario.length; i++) {
     //      System.out.print("Digite o salário " + (i + 1) + ": ");
      //     salario[i] = entrada.nextDouble();
      //  }

    //    int contadorAbaixoOuIgual = 0;
     //   for (int i = 0; i < salario.length; i++) {
      //      if (salario[i] <= media_salarial) {
         //       contadorAbaixoOuIgual++;
     //       }
     //   }

    //    System.out.println("\nTotal de salários lidos: " + salario.length);
    //    System.out.println("Funcionários com salário <= R$ " + media_salarial + ": " + contadorAbaixoOuIgual);
   // }

    // ==================== MÉTODO PESO ====================
    // public void peso() {
    //     Scanner entrada = new Scanner(System.in);
    //     double[] peso = new double[10];
    //
    //     for (int i = 0; i < peso.length; i++) {
    //         System.out.print("Digite o peso " + (i + 1) + ": ");
    //         peso[i] = entrada.nextDouble();
    //     }
    //
    //     double menor = peso[0];
    //     for (int i = 1; i < peso.length; i++) {
    //         if (peso[i] < menor) {
    //             menor = peso[i];
    //         }
    //     }
    //
    //     System.out.print("\nLista de pesos: ");
    //     for (int i = 0; i < peso.length; i++) {
    //         System.out.print(peso[i] + " ");
    //     }
    //
    //     System.out.println("\nO menor peso é: " + menor);
    // }

    // ==================== MÉTODO SEQUÊNCIA FIBONACCI ====================
    // public void sequencia() {
    //     Scanner entrada = new Scanner(System.in);
    //     System.out.print("Digite um número inteiro: ");
    //     int n = entrada.nextInt();
    //     int a = 0;
    //     int b = 1;
    //
    //     System.out.print("Sequência de Fibonacci: " + a + " " + b);
    //
    //     for (int i = 0; i < n; i++) {
    //         int proximo = a + b;
    //         System.out.print(" " + proximo);
    //         a = b;
    //         b = proximo;
    //     }
    // }
    
    // ==================== MÉTODO NOME  POSIÇÃO ====================
      
  //  public int nomes(String yuri) {
      //  Scanner entrada = new Scanner(System.in);
      //  String[] nome = new String[10];

      //  for (int i = 0; i < nome.length; i++) {
       //     System.out.print("Digite o nome " + (i + 1) + ": ");
       //     nome[i] = entrada.nextLine();

            
     //       if (nome[i].equals(yuri)) {
      //          return i; 
     //       }
    //    }
//
        
     //   return -1;
   // }
      
   


    // ==================== MAIN ====================
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       // Metodo_yuri_duarte obj = new Metodo_yuri_duarte(); // único objeto
         // Metodo_yuri_duarte app = new Metodo_yuri_duarte();

        /*
        === MENU ORIGINAL (mantido comentado) ===
        int opcao;
        do{
            System.out.println("-----MENU----");
            System.out.println("1-SOMA");
            System.out.println("2-SUBTRACAO");
            System.out.println("3-MULTIPLICACAO");
            System.out.println("4-DIVISAO");
            System.out.println("0-SAIR");
            opcao = entrada.nextInt();
        } while(opcao != 0);
        */

        // ======= OPERAÇÕES BÁSICAS =======
    //    System.out.println("\n--- Teste: operações básicas ---");
     //   System.out.print("Digite um inteiro (a): ");
     //   int a = entrada.nextInt();
     //   System.out.print("Digite outro inteiro (b): ");
      //  int b = entrada.nextInt();

      //  System.out.println("Soma: " + obj.soma(a, b));
      //  System.out.println("Subtração: " + obj.subtracao(a, b));
      //  System.out.println("Multiplicação: " + obj.multiplicacao(a, b));

      //  System.out.print("Digite um número (double) para divisão (c): ");
      //  double c = entrada.nextDouble();
      //  System.out.print("Digite outro número (double) para divisão (d): ");
      //  double d = entrada.nextDouble();
      //  System.out.println("Divisão: " + obj.divisao(c, d));

        // ======= NOME DO MÊS (SWITCH E ARRAY) =======
      //  System.out.println("\n--- Teste: nome do mês ---");
      //  System.out.print("Digite o número do mês (1 a 12): ");
      //  int mes = entrada.nextInt();
      //  System.out.println("Com switch: " + obj.nomeMesSwitch(mes));
      //  System.out.println("Com array: " + obj.nomeMesArray(mes));

        // ======= SALÁRIO FUNCIONÁRIO =======
      //  System.out.println("\n--- Teste: salárioFuncionario ---");
      //  obj.salarioFuncionario();

        // ======= SEQUÊNCIA FIBONACCI =======
      //  System.out.println("\n--- Teste: sequência Fibonacci ---");
       // obj.sequencia();

        // ======= PESO =======
      //  System.out.println("\n--- Teste: peso ---");
       // obj.peso();

        // ======= EQUAÇÃO DE 2º GRAU =======
       // System.out.println("\n--- Teste: equação de 2º grau ---");
       // obj.equacaoSegundoGrau();

      //  
      //  System.out.println("\nPrograma finalizado.");
        
        
       // ======= PET SHOP =======
        // public static void main(String[] args)  {
            
        
 
        // ==================== PET SHOP ====================
      //  System.out.println("=== Cadastro Pet Shop Amigo Fiel ===");
      //  System.out.print("Digite o nome do pet: ");
      //  String nomePet = entrada.nextLine();

      //  System.out.print("Digite a raça do pet: ");
     //   String racaPet = entrada.nextLine();

      //  System.out.print("Digite a idade do pet (em anos): ");
      //  int idadePet = entrada.nextInt();
     //   entrada.nextLine(); // consome o ENTER que sobra

     //   System.out.print("Digite o nome do dono: ");
      //  String dono = entrada.nextLine();

       // System.out.print("Digite o contato do dono: ");
      //  String contato = entrada.nextLine();

        // cria o objeto corretamente com nome de variável
       // Cachorro novoPet = new Cachorro(nomePet, racaPet, idadePet, dono, contato);

      //  System.out.println("\n=== Menu de Serviços ===");
      //  System.out.println("1. Banho");
      //  System.out.println("2. Tosa");
      //  System.out.println("3. Banho e Tosa");
      //  System.out.println("4. Consulta veterinária");
       // System.out.print("Escolha o procedimento desejado: ");
       // int op = entrada.nextInt();
       // entrada.nextLine(); // consome o ENTER que sobra

     //   System.out.println("===================================");
      //  System.out.println("FICHA DE ATENDIMENTO - AMIGO FIEL");
      //  System.out.println("===================================");
      //  novoPet.exibirDados();
      //  System.out.println("------------------------------------");

       // switch (op) {
        //    case 1: System.out.println("Procedimento.....: Banho"); break;
         //   case 2: System.out.println("Procedimento.....: Tosa"); break;
         //   case 3: System.out.println("Procedimento.....: Banho e Tosa"); break;
         //   case 4: System.out.println("Procedimento.....: Consulta veterinária"); break;
          //  default: System.out.println("Opção inválida");
       // }
      //  System.out.println("=============================================\n");

  // ====================   ALUNO ====================
    //    Aluno yuri = new Aluno("ADS123", "YURI", 7.0, 8.0, 4.0);
     //   yuri.exibirInfo();

   //     entrada.close();
  //  }
//}
/// ==================== TESTE DE PROVAS ====================
    //    Gabarito g = new Gabarito();
   //     Prova p1 = new Prova(g);
    //    Prova p2 = new Prova(g);

    //    System.out.println("\n===== Aluno 1 =====\n");
    //    for (int i = 0; i < 15; i++) {
            
            
              
            
            
             
            
            
        //    System.out.print("Digite uma resposta para questão " + (i + 1) + ": ");
         //   char rp = entrada.next().charAt(0);
        //    p1.respostaAluno(rp);
       // }

    //    System.out.println("\n===== Aluno 2 =====\n");
    //    for (int i = 0; i < 15; i++) {
    //        System.out.print("Digite uma resposta para questão " + (i + 1) + ": ");
     //       char rp = entrada.next().charAt(0);
     //       p2.respostaAluno(rp);
    //    }

   //     System.out.println("\nNota do aluno 1: " + p1.nota());
   //     System.out.println("\nNota do aluno 1: " + p1.acertos());
   //     System.out.println("Aluno 2 acertou: " + p2.acertos());
   //     System.out.println("Nota do aluno 2: " + p2.nota());
   //     System.out.println("\nMaior nota entre os dois: " + p1.maior(p2));

        
//    }
//}





// ===================== CLASSE CACHORRO (fora da classe pública) =====================
//class Cachorro {
  //  String nome_pet;
//    String raca;
  //  int idade; // usei int para idade (anos)
 //   String nome_dono;
  //  String contato_dono;

  //  public Cachorro(String nome_pet, String raca, int idade, String nome_dono, String contato_dono) {
   //     this.nome_pet = nome_pet;
    //    this.raca = raca;
    //    this.idade = idade;
    //    this.nome_dono = nome_dono;
    //    this.contato_dono = contato_dono;
  //  }

   // public void exibirDados() {
   //     System.out.println("Nome do pet......: " + nome_pet);
    //    System.out.println("Raça.............: " + raca);
     //   System.out.println("Idade (anos).....: " + idade);
     //   System.out.println("Nome do dono.....: " + nome_dono);
     //   System.out.println("Contato do dono..: " + contato_dono);
     
     
        
       // ==================== CLASSE ALUNO ====================
  //class Aluno {
 //   String matricula;
   // String nome;
 //   double notaProva1;
 //   double notaProva2;
  //  double notaTrabalho;

  //  public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
   //    this.matricula = matricula;
   //     this.nome = nome;
  //      this.notaProva1 = notaProva1;
  //      this.notaProva2 = notaProva2;
  //      this.notaTrabalho = notaTrabalho;
//    }

  //  public double media() {
   //     double mediaFinal = (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2) / 7;
   //     return mediaFinal;
  //  }

   // public double finalNecessario() {
    //    double media = media();
    //    if (media >= 7) {
      //      return 0; 
    //    } else {
      //      double necessario = 10 - media;
      //      return (necessario > 10) ? 10 : necessario;
     //   }
  //  }

  //  public void exibirInfo() {
    //    System.out.println("\n=== Dados do Aluno ===");
    //    System.out.println("Matrícula: " + matricula);
     //   System.out.println("Nome: " + nome);
     //   System.out.println("Média: " + media());
     //   double necessario = finalNecessario();
     //   if (necessario == 0) {
     //       System.out.println("Aluno aprovado! Não precisa de prova final.");
     //   } else {
       //     System.out.println("Aluno precisa de " + necessario + " pontos na prova final.");
      //  }
//====================  CLASSE GABARITO ====================
 //  class Gabarito {
  //  public char respostaQuestao(int numeroQuestao) {
  //      char respostas[] = {'A', 'C', 'D', 'A', 'A', 'B', 'C', 'D', 'B', 'E', 'A', 'B', 'A', 'C', 'C'};
  //      return respostas[numeroQuestao - 1];
 //   }
//}

// ==================== CLASSE PROVA ====================
//class Prova {
 //   Gabarito gabarito;
  //  char respostaAluno[] = new char[15];
 //   int i = 0;

 //   public Prova(Gabarito g) {
 //       this.gabarito = g;
 //   }

 //   public void respostaAluno(char resposta) {
    //    if (i < 15) {
     //       respostaAluno[i] = resposta;
     //       i++;
    //    }
 //  }

  //  public int acertos() {
   //     int cont = 0;
   //     for (int i = 0; i < 15; i++) {
   //         if (respostaAluno[i] == gabarito.respostaQuestao(i + 1)) {
        //        cont++;
       //     }
      //  }
   //     return cont;
   // }

  //  public double nota() {
   //     double total = 0;
    //    for (int i = 0; i < 15; i++) {
     //       if (respostaAluno[i] == gabarito.respostaQuestao(i + 1)) {
     //           if (i < 10) {
     //               total += 0.5;
         //       } else {
          //          total += 1;
         //       }
       //     }
     //   }
     //   return total;
  //  }

  //  public double maior(Prova outra) {
   //     int acertos1 = this.acertos();
   //     int acertos2 = outra.acertos();
   //     double nota1 = this.nota();
   //     double nota2 = outra.nota();

  //      if (acertos2 > acertos1) return outra.nota();
  //      else if (acertos2 < acertos1) return this.nota();
  //      else return Math.max(nota1, nota2);
    }
}

    

