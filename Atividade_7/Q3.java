package atividade7poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //Variavel para ler a entrada do usuario
        Scanner leitor = new Scanner(System.in);
        //Variaveis para a divisão
        int numerador, denominador;
        double resultado;

    //Bloco que pode causar a exceção
    try {

        //Digitar o numerador e o denominador, e em seguida calcula e exibe o resultado
        System.out.println("Valor do numerador:");
        numerador= leitor.nextInt();
        System.out.println("Valor do denominador:");
        denominador= leitor.nextInt();
        resultado = numerador/denominador;
        System.out.println("Resultado: " + resultado);
        System.out.println();
    } catch (InputMismatchException e) {//Exibe a mensagem de erro se especificamente o usuario digita algo que não seja um numero inteiro
        System.out.println("Erro: Insira apenas valores numericos!");
    } catch (ArithmeticException e){//Exibe a mensagem de erro se especificamente o usuario digitar zero no denominador
        System.out.println("Erro: Divisão por zero!");
    } finally {
        leitor.close();//Fecha o Scanner
    }

    

    }
}
