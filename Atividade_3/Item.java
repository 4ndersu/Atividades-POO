package atividade3poo;

public class Item {
   
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public Item(){
    setNome(nome);
    setCodigo(codigo);
    setQuantidade(quantidade);
    setPrecoUnitario(precoUnitario);
    }

    public void AtualizarEstoque(int quantidade){

        if(getQuantidade() < quantidade){
            System.out.println("Não é possivel atualizar o estoque");
        } else {
            setQuantidade(getQuantidade() - quantidade);
            System.out.println("Quantidade atualizada para: " + getQuantidade());
        }

    }

    //Função para inicializar o array de alunos
    public static void ArmazenarInventario(Item[] itens){

    for(int contador=0;contador<=(itens.length-1); contador++){
    itens[contador]= new Item();
            }
    }

    public void CalcularItem(){
        double total;
        total = getQuantidade() * getPrecoUnitario();

        System.out.println("Total do item: R$" + total);
    }

    public static void CalcularInventario(Item[] inventario){{
        double totalInventario=0;

        for(int contador=0; contador<inventario.length; contador++){
            totalInventario += inventario[contador].getPrecoUnitario() * inventario[contador].getQuantidade();
        }

        System.out.println("Total do inventario: R$" + totalInventario);
    }

    }
    
    public void ExibirItem(){
        System.out.println("NOME: " + getNome());
        System.out.println("CODIGO: " + getCodigo());
        System.out.println("QUANTIDADE: " + getQuantidade());
        System.out.println("PRECO UNITARIO: " + getPrecoUnitario());
        CalcularItem();
        System.out.println();
    }

    
}
