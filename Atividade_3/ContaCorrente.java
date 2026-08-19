package atividade3poo;

public class ContaCorrente {

    //Declara os atributos da classe ContaCorrente
    private int numeroConta;
    private double saldo;
    private double limite;
    
    //Getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Construtor da conta corrente
    public ContaCorrente(int numeroConta, double saldo, double limite) {
        setNumeroConta(numeroConta);
        setLimite(limite);
        setSaldo(saldo);
    }

    //Mostrar status da conta 
    public void ExibirConta(){
        System.out.println("-----CONTA-----");
        System.out.println("NUMERO DA CONTA: " + getNumeroConta());
        System.out.println("SALDO DA CONTA: " + getSaldo());
        System.out.println("LIMITE DA CONTA: " + getLimite());
    }

    //Metodo de sacar dinheiro
    public void Sacar(double valor){
        //Verifica se o valor do saque é valido
        if(valor > 0){
        //Verifica se o dinheiro do saque é maior que o o limite, se for, o saque não é feito
        if(getSaldo()-valor>= -getLimite()){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque de " + valor + " reais realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque");
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
    }
    
}
