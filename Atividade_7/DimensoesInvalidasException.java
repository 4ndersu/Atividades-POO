package atividade7poo;

//Define uma exceção personalizada que herda de Exception
public class DimensoesInvalidasException extends Exception {

    //Construtor padrão
    public DimensoesInvalidasException() {
    }
    
    //Construtor com uma mensagem de erro personalizada
    public DimensoesInvalidasException(String mensagem) {
        super(mensagem); //Chama o construtor da superclasse(Exception) com a mensagem
    }
}
