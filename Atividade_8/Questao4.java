package atividade8poo;

import java.io.*;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        String nomeArquivo = "multilinhas.txt";

        //Loop para exibir o menu de opções
        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Gravar linhas no arquivo");
            System.out.println("2 - Mostrar o conteudo do arquivo");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opçao: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                //Caso o usuario digite 1, entrará na rotina de criar um novo arquivo de texto multilinha
                case 1:
                    //Bloco try-catch para criar um novo arquivo multilinhhas.txt utilizando FileWriter
                    try (FileWriter escritor = new FileWriter(nomeArquivo)) {
                        //Loop para adicionar varias linhas no conteudo do arquivo de texto que só é encerrado quando o usuario digita o ponto final
                        System.out.println("Digite varias linhas de texto (digite '.' para encerrar):");
                        String linha;
                        while (true) {
                            linha = leitor.nextLine();
                            if (linha.equalsIgnoreCase(".")) {
                                break;
                            }
                            //Armazena todo o conteudo digitado em 'multilinhas.txt'
                            escritor.write(linha + System.lineSeparator());
                        }
                        System.out.println("Arquivo '" + nomeArquivo + "' salvo com sucesso!");
                    } catch (IOException e) {//Lança uma exeção em caso de erro na criação do arquivo de texto
                        System.out.println("Erro ao gravar o arquivo.");
                        e.printStackTrace();
                    }
                    break;
                //Caso o usuario digite 2, entrará na rotina de mostrar o conteudo do arquivo de texto multilinha
                case 2:
                    //Tenta abrir e ler o arquivo com o nome armazenado
                    try (BufferedReader scanner = new BufferedReader(new FileReader(nomeArquivo))) {
                        String linha;//Variável para armazenar cada linha lida do arquivo
                        System.out.println("\nConteudo do arquivo '" + nomeArquivo + "':");
                         //Loop para ler e imprimir o arquivo linha por linha até chegar ao final
                        while ((linha = scanner.readLine()) != null) {
                            System.out.println(linha);
                        }
                    } catch (IOException e) {//Captura e trata possíveis exceções de entrada/saída
                        System.out.println("Erro ao ler o arquivo");
                        e.printStackTrace();
                    }
                    break;
                //Caso o usuario digite 3, encerra o programa
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opçao invalida, tente novamente");
            }

        } while (opcao != 3);

        leitor.close();
    }
}
