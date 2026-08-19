package atividade3poo;

public class Pedido {

    //Declara o atributo pra classe LojaOnline
    private double pedido;

    //Getters e Setters
    public double getPedido() {
        return pedido;
    }

    public void setPedido(double pedido) {
        this.pedido = pedido;
    }

    //Construtor sem parametros
    public Pedido(){
        setPedido(pedido);
    }



    //Metodo para inicializar um array de pedidos para não dar nullpointexception
    public static void ArmazenarPedidos(Pedido[] pedidos){
        for(int contador=0;contador<=(pedidos.length-1); contador++){
            pedidos[contador]= new Pedido();
        }
    }

    // Método para descontar o valor de um único pedido
public static void DescontarPedido(Pedido pedido) {

    double desconto = 0, novoPreco;
    double valor = pedido.getPedido();

    System.out.println("Preço atual do pedido: " + valor);

    // Define o valor do desconto baseado no valor do pedido
    if (valor > 500) {
        desconto = 0.2;
    } else if (valor >= 200 && valor <= 500) {
        desconto = 0.1;
    } else if (valor < 200) {
        desconto = 0.05;
    }

    // Calcula o novo preço do pedido com o desconto
    novoPreco = valor - (valor * desconto);

    // Imprime o novo preço
    System.out.println("Preço do pedido com o desconto: " + novoPreco);
}

    
    //Metodo para descontar o valor do pedidos de um array
    public static void DescontarPedido(Pedido[] pedido){

        //Percrre o array de pedidos
        for(int contador=0; contador<pedido.length;contador++){
            //Declara a variavel de desconto, novo preco e o valor de cada indice
            double desconto=0, novoPreco, valor = pedido[contador].getPedido();

            System.out.println("Preco atual do pedido: " + valor);

            //Define o valor do desconto baseado no valor do pedido
            if(valor > 500 ){
                desconto=0.2f;
            }else if(valor>=200 && valor <= 500){
                desconto =0.1f;
            } else if(valor < 200){
                desconto=0.05f;
            }
        
            //Calcula o novo preço do pedido com o desconto 
        novoPreco=valor - (valor *desconto);
        //Imprime o novo preço
        System.out.println("Preco do pedido com o desconto: " + novoPreco);
        System.out.println();
    }

    }


}
