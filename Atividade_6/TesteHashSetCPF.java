package atividade6poo;

import java.util.HashSet;
import java.util.Scanner;
public class TesteHashSetCPF {

    //QUESTÃO 2: CPF
    public static void main(String[] args) {
        //Cria Hashset de strings de CPFs
        HashSet<String> CPF = new HashSet<>();
        //Objeto Scanner para entrada do usuário
        Scanner leitor = new Scanner(System.in);
        
        //Determinar o tamanho do HashSet
        System.out.println("Adicionar quantos cpfs?");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        //Laço de repetição para adicionar as strings do cpf
        for(int i = 0; i<quantidade; i++){
            System.out.print("CPF " + (i + 1) + ": ");
            String codigo = leitor.nextLine();
            CPF.add(codigo);
        }
        //Fecha o leitor
        leitor.close();
        //No print, esse cpf foi adicionado mais de uma vez para mostrar a propriedade de não duplicadas do HashSet
        System.out.println("CPF repetido: 444.925.010-96 3 vezes");
        
        //Imprime as strings de COF de CPFs do Hashset através de um for
        System.out.println("\nLista de CPFs: ");
        for (String cpfs : CPF) {
            System.out.println(cpfs);
        }
    }

    }

