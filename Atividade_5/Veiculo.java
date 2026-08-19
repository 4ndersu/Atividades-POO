package atividade5poo;

//Declaração da classe abstrata Veículo
public abstract class Veiculo {
    //Atributo em comum tanto em Carro quanto em Moto
    protected double preco;

    //Getters e Setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Declaração do método abstrato CalcularAluguel usando os dias como parametro
    public abstract void CalcularAluguel(int dias);
    
}
