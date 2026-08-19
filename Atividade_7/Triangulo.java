package atividade7poo;

import java.util.Scanner;
//QUESTÃO 5: Triangulo
public class Triangulo {
    
    private int lado1, lado2, lado3;

    //Método privado que verifica se três valores inteiros podem formar um triângulo válido
    private boolean validoT(int lado1, int lado2, int lado3) {
        return (lado1 > Math.abs(lado2 - lado3) && lado1 < lado2 + lado3) && //Condição lado1
               (lado2 > Math.abs(lado1 - lado3) && lado2 < lado1 + lado3) &&//Condição lado2
               (lado3 > Math.abs(lado1 - lado2) && lado3 < lado1 + lado2);//Condição lado3
    }

    //Getters e Setters
    public int getLado1() {
        return lado1;
    }
    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    // Métodos setters com verificação de dimensões validas 
    public void setLado1(int lado1) throws DimensoesInvalidasException {
        if (!validoT(lado1, this.lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Novo valor do lado1 faz o triângulo ser inválido.");
        }
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) throws DimensoesInvalidasException {
        if (!validoT(this.lado1, lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Novo valor do lado2 faz o triângulo ser inválido.");
        }
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) throws DimensoesInvalidasException {
        if (!validoT(this.lado1, this.lado2, lado3)) {
            throw new DimensoesInvalidasException("Novo valor do lado3 faz o triângulo ser inválido.");
        }
        this.lado3 = lado3;
    }

    //Construtor da classe Triangulo, que lança a exceção DimensoesInvalidasException se os lados forem inválidos
    public Triangulo(int lado1, int lado2, int lado3) throws DimensoesInvalidasException {
        if (!validoT(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para o triângulo.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static void main(String[] args) {
        
        //Bloco try-catch onde pode ocorrer a exceção
        try{
            //a)Instanciar um triângulo com lados 3, 4 e 5
            Scanner leitor = new Scanner(System.in);
            Triangulo t1 = new Triangulo(3, 4, 5);
            System.out.println("Triângulo criado com sucesso, lado1=3, lado2=4 e lado3=5");

            //b)Mudar o primeiro lado para 10
            System.out.println("Novo valor do lado1 de t1: ");
            t1.setLado1(leitor.nextInt());
            
            //c)Ler três números do usuário
            System.out.println("Triangulo t2: ");
            System.out.print("Digite o lado 1: ");
            int l1 = leitor.nextInt();
            System.out.print("Digite o lado 2: ");
            int l2 = leitor.nextInt();
            System.out.print("Digite o lado 3: ");
            int l3 = leitor.nextInt();

            //d)Instanciar um triângulo com os valores lidos
            Triangulo t2 = new Triangulo(l1, l2, l3);
            System.out.println("Triângulo t2 criado com sucesso.");

        //Lança a exceção DimensoesInvalidasException caso as dimensões do triangulo sejam invalidas nos setters ou no contrutor
    }  catch (DimensoesInvalidasException e) {
        System.err.println("Erro: " + e.getMessage());
    }

}

}
    

