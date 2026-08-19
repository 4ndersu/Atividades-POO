package atividade7poo;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Variaveis para entrada e armazenar a string e a posição da letra
        Scanner leitor = new Scanner(System.in);
        String nome;
        int numero;

        //Bloco try-catch para tratar a exceção de posição inválida digitada
        try {
            System.out.println("Nome: ");
            nome = leitor.nextLine();
            System.out.println("Numero: ");
            numero = leitor.nextInt();

            char letra = nome.charAt(numero);
            System.out.println("Letra: " + letra + " na posição " + numero);
        } catch (StringIndexOutOfBoundsException e) { //Exibir essa mensagem caso caia na exceção StringIndexOutOfBoundsException
            System.out.println("Erro: Posição inválida para o nome!");
        } catch (Exception e) {//Exibir outra mensagem caso a exceção seja por outra motivo diferente
            System.out.println("Erro: " + e.getMessage());
        } finally {//Fecha o scanner
            leitor.close();
        }
    }
}
