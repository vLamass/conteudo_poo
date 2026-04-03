public class ContaBancaria {
    
    Integer numero; 
    String titular;
    Double saldo = 50.00;
    int quantidade_Saques = 0;

    public void depositar(double valor){

        if(valor > 0){

            saldo += valor;
            System.out.println("Depósito Realizado com Sucesso! ");
        }
        else {
            System.out.println("Valor Inválido! ");
        }
    }    
    
    public void sacar(double valor){

        if (quantidade_Saques > 2) {
            System.out.println("Limite de saques diários atingido.");
            return;
        }
        
        if (valor > 1000) {
            System.out.println("Valor máximo por saque é R$ 1000,00.");
            return;
            
        }
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
            
        }
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");

        }
            saldo -= valor;
            quantidade_Saques++;
            System.out.println("Saque Realizado Com Sucesso");


    }    
    
    
    }

    


