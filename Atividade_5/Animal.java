package atividade5poo;

//Declarando a classe abstrata Animal
public abstract class Animal {
    //Atributo em comum com Cachorro e Gato
    protected String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Declaração do método abstrato EmitirSom
    public abstract void EmitirSom();
}
