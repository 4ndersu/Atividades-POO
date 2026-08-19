package atividade7poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //Variavel para ler a entrada do usuario
        Scanner leitor = new Scanner(System.in);
        //Arraylist para armazenar a idade das pessoas
        ArrayList<Integer> idades = new ArrayList<>();

        //Adicionando 10 idades
        idades.add(12);
        idades.add(17);
        idades.add(25);
        idades.add(30);
        idades.add(44);
        idades.add(51);
        idades.add(19);
        idades.add(23);
        idades.add(60);
        idades.add(38);

        //Imprime o arraylist de idades
        System.out.println("Idades: " + idades);

        //Bloco try-catch onde a exceção pode acontecer
        try{
        System.out.println("Remover qual posição de idade?");

        int opcao = leitor.nextInt();
        System.out.println("Removendo a idade " + idades.get(opcao) + " da posicão " + opcao);
        idades.remove(opcao);
        System.out.println("Idades: " + idades + "\n");
        //Exibe a mensagem de erro se especificamente o usuario digitar uma posição que não existe idade armazenada no arraylist
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Erro: Posição invalida!");
        } catch (Exception e) {//Exibir outra mensagem caso a exceção seja por outra motivo diferente
            System.out.println("Erro: " + e.getMessage()); 
        } finally {
            //Fecha o scanner
            leitor.close();
        }
            
    }
}
