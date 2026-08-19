package atividade4poo;

//Declarando a classe Conta como abstract por ser a mais generalizada 
public abstract class Conta {

    //Atributo Saldo 
    private double saldo;

    //Getters e Setters para o atributo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor para conta
    public Conta(double saldo) {
        setSaldo(saldo);;
    }

    //Metodo abstrato para ver saldo da conta implementado nas subclasses
    public abstract void VerSaldo();

    //Metodo de sacar dinheiro
    public void Sacar(double valor){
        //Verifica se o valor do saque é valido
        if(valor > 0){
            //Verifica se o dinheiro do saque é maior que o saldo atual, se for, o saque não é feito
            if (valor <= getSaldo()) {
                    setSaldo(getSaldo() - valor);
                    System.out.println("Saque de " + valor + " reais realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }                
        } else {
            System.out.println("Valor de saque invalido");
        }
    }
        
    //Metodo para depositar dinheiro na conta
    public void Depositar(double valor){
        //Verifica se é um valor valido de deposito
        if(valor>0){
            setSaldo(getSaldo()+valor);
            System.out.println("Deposito de " + valor + " reais realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito nao e valido");
        }
        System.out.println();
    }
      
}
