package atividade8poo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Questao2 {

    //Metodo para Ler o conteudo de um arquivo de texti
    public static void LerArquivo(){

        //Bloco try-catch que abre o arquivo "dados.txt" para leitura
        try (FileInputStream fis = new FileInputStream("dados.txt")) {
            
            int byteLido; //Variavel para armazenar cada byte lido do arquivo
            System.out.println("\nConteudo de dados.txt byte a byte:");
            
            //Loop que lê o arquivo byte por byte até encontrar o final
            while ((byteLido = fis.read()) != -1) {
                System.out.print((char) byteLido);// Converte cada byte em caractere e imprime
            }
            System.out.println();
        
        } catch (IOException e) {//Captura exceção caso haja algum erro de ou arquivo inexistente
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    //Metodo para copiar dados.txt em copia_dados.txt
    public static void CopiarArquivo(){
        try (FileInputStream fis = new FileInputStream("dados.txt"); //Abre o arquivo original para leitura
            FileOutputStream fos = new FileOutputStream("copia_dados.txt")) { //Cria ou substitui o arquivo de destino
            
                int byteLido;//Variavel para armazenar cada byte lido do arquivo
                System.out.println("\nConteudo de dados.txt byte a byte:");

                    //Loop que lê o arquivo original byte por byte até encontrar o final
                    while ((byteLido = fis.read()) != -1) {
                        fos.write(byteLido);// Escreve o byte no novo arquivo e copia exatamente o mesmo conteudo
                    }
            
                System.out.println("Arquivo copiado com sucesso para copia_dados.txt");
                System.out.println();
        } catch (IOException e) { //Captura qualquer erro de entrada/saída, arquivo não encontrado ou sem permissão por exemplo
            System.out.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        //Loop para exibir o menu de opções
        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Ler dados.txt");
            System.out.println("2 - Copiar dados.txt para copia_dados.txt");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            //Caso o usuario digite 1, ele vai ler o arquivo
            switch (opcao) {
                case 1:
                    LerArquivo();
                    break;
            //Caso o usuario digite 2, ele vai copiar o arquivo dados.txt
                case 2:
                    CopiarArquivo();
                    break;
            //Caso o usuario digite 3, ele sai do programa
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
            }
        } while (opcao != 3);

        leitor.close();
    }


}

