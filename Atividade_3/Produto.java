package atividade3poo;

public class Produto {
    //Declarando atributos da classe Produto
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    
    //Getters e Setters dos atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        //Armazenar atributo somente se for um formato de nome valido
        if(nome==null){
            System.err.println("Nome invalido");
        } else {
            this.nome = nome;
        }
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        //Armazenar atributo somente se for um formato de preco maior que zero
        if(preco<=0){
            System.err.println("Preco invalido");
        } else {
            this.preco = preco;
        }
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        //Armazenar atributo somente se for um formato de quantidade maior que zero
        if(quantidadeEmEstoque<=0){
            System.err.println("Quantidade invalida");
        } else {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

    }

    //Construtor da classe
    public Produto(String nome, double preco, int quantidadeEmEstoque){
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    //Função para exibir produto somente se estiver em um formato valido de informações
    public void ExibirProduto(){
        if(this.getNome()!=null && this.getPreco() > 0 && this.getQuantidadeEmEstoque()>0){
        System.out.println("-----PRODUTO-----");
        System.out.println("NOME DO PRODUTO: " + this.getNome());
        System.out.println("PRECO DO PRODUTO: " + " R$" + this.getPreco());
        System.out.println("QUANTIDADE DO PRODUTO: " + this.getQuantidadeEmEstoque() );
        System.out.println();
    } else {
        System.out.println("Nao foi possivel armazenar o produto(Atributo invalido)");
    }

}

    
}
