package atividade5poo;

//Declara a classe CartaoCredito que implementa a interface Pagamento
public class CartaoCredito implements Pagamento {

    //Sobrescreve o método de ProcessarPagamento da interface para a implementação própria em CartaoCredito
    @Override
    public void ProcessarPagamento() {
        System.out.println("Pagamento feito por cartão de crédito.");
    }

}
