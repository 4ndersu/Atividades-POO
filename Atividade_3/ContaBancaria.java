package atividade3poo;

public class ContaBancaria {

    //Decalra os atributos da conta como privados
    private String titular;
    private double saldo;

    //Getters e Setters tambem privados
    private String getTitular() {
        return titular;
    }
    private void setTitular(String titular) {
        this.titular = titular;
    }
    private double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor
    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }
    //Metodo para depositar dinheiro na conta
    //(Atributos só podem ser acessados no metodo para maior segurança)
    public void Depositar(double valor){
        if(valor>0){
        setSaldo(getSaldo() + valor);
        System.out.println("Depositado R$" + valor + "com sucesso");
        }
    }
    //Metodo de sacar garantindo que não ira ficar negativo
    public void Sacar(double valor){
        if(valor>0){
            if(getSaldo()-valor >= 0){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque de " + valor + " reais realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    } else {
        System.out.println("Valor de saque invalido");
    }

    }

    //Metodo para imprimir atributos
    public void DetalharConta(){
        System.out.println("-----CONTA-----");
        System.out.println("NUMERO DA CONTA: " + getTitular());
        System.out.println("SALDO DA CONTA: R$" + getSaldo());
        
    }
}
