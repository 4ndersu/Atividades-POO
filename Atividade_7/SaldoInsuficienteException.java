package atividade7poo;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
    }
    
    //Construtor com uma mensagem de erro personalizada
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem); //Chama o construtor da superclasse(Exception) com a mensagem
    }
}
