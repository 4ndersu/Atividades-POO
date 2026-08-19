package atividade4poo;

public class ContaPoupanca extends Conta {

    //Construtor da classe ContaPoupanca
    public ContaPoupanca(double saldo) {
        super(saldo); // chama o construtor da classe mãe Conta
    }
    
    //Metodo sobrescrito de ver saldo para conta poupanca
    @Override
    public void VerSaldo(){
        System.out.println("Saldo da conta poupanca: R$" + getSaldo());
        System.out.println();
    }

    //Metodo de aplicar os juros mensais no saldo atual da conta poupanca, recebendo o mes como parametro
    public void VerSaldoJuros(int meses) {
        double saldo = getSaldo();
        double taxa = 0.005; // 0,5% ao mês
        
        //Calcula o valor final do saldo baseado na quantidade de meses
        for (int i = 0; i < meses; i++) {
            saldo += saldo * taxa;
        }
        
        //Imprime o valor do saldo da poupanca com os juros aplicados
        System.out.println("Saldo com juros de " + meses + " meses com taxa de juros de 0,5%: R$" + saldo);
        System.out.println();
    }

    
    
}
