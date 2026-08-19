package atividade5poo;

//Declaração da classe Moto que herda Veiculo
public class Moto extends Veiculo {

    //Método de CalcularAluguel sobrescrito de veículo para funcionamento prórpio em Moto
    @Override
    public void CalcularAluguel(int dias) {
        double valorFinal;
        valorFinal = dias * 75.0;
        
        System.out.println("Valor do aluguel de moto por "  + dias + " dias(R$75 por dia): R$" + valorFinal);
    }
}
