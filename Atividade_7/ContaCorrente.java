package atividade7poo;

import java.util.Scanner;
//QUESTÃO 6: CONTA BANCO
public class ContaCorrente {

    //Atributos da classe ContaCorrente
    private double saldo;
    private int numeroConta;

    //Getters e Setters
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //Construtor sem parametros
    public ContaCorrente() {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    //Método para sacar que pode lançar a exceção SaldoInsuficienteException
    public void Sacar(double valor) throws SaldoInsuficienteException {
        //Verifica se o valor do saque é valido
        if(valor > 0){
            //Verifica se o dinheiro do saque é maior que o saldo atual, se for, o saque não é feito
            if (valor <= getSaldo()) {
                    setSaldo(getSaldo() - valor);
                    System.out.println("Saque de " + valor + " reais realizado com sucesso.");
                } else {
                    throw new SaldoInsuficienteException("Erro: Saldo insuficiente para o saque!");
                }                
        } else {
            throw new SaldoInsuficienteException("Erro: Saque invalido!");
        }


    }

    public static void main(String[] args) {
        //Instancia um objeto ContaCorrente e um leitor
        ContaCorrente conta = new ContaCorrente();
        Scanner leitor = new Scanner(System.in);

        //Bloco que pode causar exceção
        try{
        System.out.println("Numero da conta:");
        conta.setNumeroConta(leitor.nextInt());
        System.out.println("Saldo da conta: ");
        conta.setSaldo(leitor.nextInt());
        System.out.println("Numero: " + conta.getNumeroConta() + "\nSaldo: " + conta.getSaldo() + " reais ");
        for(int i=1; i<=10; i++){
        System.out.println("Valor do saque: ");
        conta.Sacar(leitor.nextInt());
        System.out.println("Saldo atual: " + conta.getSaldo() + " reais ");
        }
        } catch (SaldoInsuficienteException e){//Exibe a mensagem de erro se especificamente o usuario tentar sacar um valor maior do que o saldo na conta dele
            System.err.println(e.getMessage());
        }
    }
    
}
