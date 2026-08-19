package atividade4poo;

public class ContaTesouroDireto extends ContaPoupanca {

    //Construtor da classe ContaTesouroDireto
    public ContaTesouroDireto(double saldo) {
        super(saldo); //Chama o construtor da classe ancestral Conta
    }

    //Metodo de ver saldo sobrescrito para o Tesouro Direto
    @Override
    public void VerSaldo(){
        System.out.println("Saldo da conta Tesouro Direto: R$" + getSaldo());
    }

    //Metodo de depositar dinheiro sobrescrito para o Tesouro Direto
    @Override
    public void Depositar(double valor){
        //Verifica se é um valor valido de deposito (maior que 1000)
        if(valor>1000){
            setSaldo(getSaldo()+valor);
            System.out.println("Deposito de " + valor + " reais realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito nao e valido");
        }
        System.out.println();
    }

    //Metodo de aplicar saldo com juros sobrescrito para o Tesouro Direto
    @Override
    public void VerSaldoJuros(int meses) {
        double saldo = getSaldo();
        double taxa = 0.01; // 1% ao mês
    
        for (int i = 0; i < meses; i++) {
            saldo += saldo * taxa;
        }

        //Imprime o valor do saldo com os juros baseado nos meses
        System.out.println("Saldo com juros de " + meses + " meses com taxa de juros de 1%: R$" + saldo);
        System.out.println();
}

}
