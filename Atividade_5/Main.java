package atividade5poo;


public class Main {
    
    //Questao 2: Pagamento
    //Metodo de Finalizar Compra que recebe um objeto do tipo Pagamento 
    public static void finalizarCompra(Pagamento pagamento){
        //Processa o pagamento do objeto passado como parametro
        pagamento.ProcessarPagamento();
    }

    public static void main(String[] args) {
        
        //Questão 1: Animal
        //Instancia uma lista de animais
        Animal[] Animais = new Animal[6];

        //Instancia cada animal a um animal diferente, sendo cachorro ou gato
        Animais[0] = new Cachorro();  
        Animais[1] = new Gato();
        Animais[2] = new Gato();
        Animais[3] = new Cachorro();
        Animais[4] = new Cachorro();
        Animais[5] = new Gato();
        
        System.out.println("Som dos animais: ");
        //Itera sobre o Array de animais e emite seu respecitvo som a depender do animal em cada indice
        for(Animal animal :  Animais){ 
            animal.EmitirSom();
        }
        System.out.println();
        
        //Questão 2: Pagamento
        //Instancia dois objetos do tipo CartaoCredito e Dinheiro            
        Pagamento cartao = new CartaoCredito();
        Pagamento money = new Dinheiro();

        //Processa o pagamento de cada objeto a depender de qual classe ela pertence(Cartao e Dinheiro respectivamente), chamando a função de finalizarCompra()
        System.out.println("Pagamento 1: cartao");
        finalizarCompra(cartao);
        System.out.println("Pagamento 2: dinheiro");
        finalizarCompra(money);
        System.out.println();
        
        //Questão 3: Veiculo
        //Instancia dois objetos, uma da classe Carro e outra da classe Moto
        Carro carro = new Carro();
        Moto moto = new Moto();

        //Chama a função de CalcularAluguel do seu respectivo objeto como foi implementada em cada Classe
        carro.CalcularAluguel(5);
        moto.CalcularAluguel(5);
    }

}
