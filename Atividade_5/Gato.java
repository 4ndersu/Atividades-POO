package atividade5poo;
//Declarando uma classe Gato que herda a classe Abstrata Animal
public class Gato extends Animal {

    //Metodo de Emitir Som do Gato Sobrescrito da Classe abstrata Animal
    @Override
    public void EmitirSom() {
        System.out.println("Miau!");
    }

}
