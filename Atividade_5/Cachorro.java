package atividade5poo;
//Declarando uma classe Cachorro que herda a classe Abstrata Animal
public class Cachorro extends Animal {

    //Metodo de Emitir Som do cachorro Sobrescrito da Classe abstrata Animal
    @Override
    public void EmitirSom() {
        System.out.println("Au! Au!");
    }

}
