package atividade4poo;

public class ContaCorrente extends Conta {
    
    //Construtor da classe CntaCorrente
    public ContaCorrente(double saldo) {
        super(saldo); // chama o construtor da classe mãe Conta
    }

    //Metodo sobrescrito de ver saldo para conta corrente
    @Override
    public void VerSaldo(){
        System.out.println("Saldo da conta corrente: " + getSaldo());
        System.out.println();
    }


}
