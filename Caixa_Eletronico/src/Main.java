import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        /*1 - Lógica e Estruturas de Controle
        Exercício: Simulador de Caixa Eletrônico (Apenas Lógica no main).
        Detalhes: Criar um menu com do-while e switch (1-Ver Saldo, 2-Depositar, 3-Sacar, 0-Sair).
        Regra de Negócio:
        - O caixa eletrônico tem um limite máximo de 3 saques diários. Se o usuário tentar um 4o
        saque, o sistema deve bloquear a operação informando "Limite de saques diários
        atingido".
        - O valor máximo por saque é de R$ 1.000,00, por questões de segurança. */

        double saldo = 0;
        int opcao;
        int quantidade_Saques = 0;
        double valor;
        

        ContaBancaria conta = new ContaBancaria();

            System.out.println("Digite o Titular da Conta: ");
            conta.titular = leia.next();
            
            System.out.println("Digite o Numero da Sua Conta: "); 
            conta.numero = leia.nextInt();

            

            

            do{
                System.out.println("1 - Ver saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                
               opcao = leia.nextInt();

                
            
              switch (opcao) {
                case 1:
                    System.out.println("Seu Saldo Atual é R$:" + conta.saldo);    

                break;

                case 2:
                    System.out.println("Digite o Valor do Deposito: ");
                    double depositar = leia.nextInt();
                    conta.depositar(depositar);
                break;

                case 3:
                    System.out.println("Digite o Valor de Saque: ");
                    double sacar = leia.nextInt();
                    conta.sacar(sacar);
                break;
                    
                case 0:
                    System.out.println("Sair");
                break;
                    
                default:
                    break;
              }  
                

            }
        
            while (opcao != 0);
                
        
        } 
    }

