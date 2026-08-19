package atividade6poo;
import java.lang.Math;//Iportado para usar o valor de Pi e potenciação
import java.util.ArrayList;
public class Circulo {
    //Atributo da classe Circulo
    private double raio;

    //Getters e Setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    //Construtor
    public Circulo(double raio){
        setRaio(raio);
    }

    //Metodo para calcular o raio do circulo
    public static void CalcularArea(Circulo circulo){
        double area;
        area = Math.PI * Math.pow(circulo.getRaio(), 2);//Operações que usam a biblioteca Math
        System.out.println("Area do circulo de raio " + circulo.getRaio() + "m " + area + "m");
    }

    public static void main(String[] args) {

        //QUESTÃO 1: Circulo
        //Instancia 5 objetos da classe Circulo
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(2);
        Circulo circulo3 = new Circulo(3);
        Circulo circulo4 = new Circulo(4);
        Circulo circulo5 = new Circulo(5);
        
        //Arraylist de objetos da classe Circulo
        ArrayList<Circulo> circulos = new ArrayList();

        //Adiciona os cinco circulos no ArrayList Circulos
        circulos.add(circulo1);
        circulos.add(circulo2);
        circulos.add(circulo3);
        circulos.add(circulo4);
        circulos.add(circulo5);

        //Percorre o Arraylist e imprime a area de cada círculo
        for(int i = 0; i<circulos.size(); i++){
            Circulo.CalcularArea(circulos.get(i));
        }
    }
}