package atividade5poo;

//Declara a classe Dinheiro que implementa a interface Pagamento
public class Dinheiro implements Pagamento {

    //Sobrescreve o método de ProcessarPagamento da interface para a implementação própria em Dinheiro
    @Override
    public void ProcessarPagamento() {
        System.out.println("Pagamento feito por dinheiro.");
    }

}
