package atividade3poo;

public class Loja {
    //Instancia um objeto da classe Produto generico 
    Produto produto = new Produto("Produto", 1, 1);
    //Declara uma variavel para armazenar o toal de vendas e o inicializa
    private double pedido;
    private double totalVendas=0;

    //Getters e Setters
    public double getTotalVendas() {
        return totalVendas;
    }

    public double getPedido() {
        return pedido;
    }

    public void setPedido(double pedido) {
        this.pedido = pedido;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    //Função para registrar uma venda de um produto
    public void RegistarVenda(Produto produto){
        setTotalVendas(totalVendas + produto.getPreco());
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - 1);
        System.out.println("Produto " + produto.getNome() + " vendido com sucesso");
    }

    //Função para mostrar o total de vendas
    public void ConsultarVendas(Produto produto){
    System.out.println("Total de vendas de " + produto.getNome() + ": "  + getTotalVendas() + " R$");
    }

}
