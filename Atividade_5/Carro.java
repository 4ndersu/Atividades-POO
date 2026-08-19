package atividade5poo;

//Declaração da classe Carro que herda Veiculo
public class Carro extends Veiculo {

    //Método de CalcularAluguel sobrescrito de veículo para funcionamento prórpio em Carro
    @Override
    public void CalcularAluguel(int dias) {
        double valorFinal;
        valorFinal = dias * 150.0;
        
        System.out.println("Valor do aluguel de carro por "  + dias + " dias(R$150 por dia): R$" + valorFinal);
    }

}
