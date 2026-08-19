package atividade8poo;

import java.io.*;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeArquivo = null;

        int opcao;
        
        //Loop para exibir o menu de opções
        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Criar novo arquivo de texto");
            System.out.println("2 - Mostrar conteudo do arquivo");
            System.out.println("3 - Apagar o arquivo criado");
            System.out.println("4 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // limpa o buffer do teclado

            switch (opcao) {
            //Caso o uruario digite 1, entrará na rotina de criar um novo arqivo de texto
                case 1:
                //Digitar o nome do novo arquivo
                    System.out.println("Digite o nome do novo arquivo(digite ao final '.txt'): ");
                    nomeArquivo = leitor.nextLine();
                //Digitar o que será escrito no arquivo 
                    System.out.println("Digite o conteudo do arquivo:");
                    String conteudo = leitor.nextLine();

                    try {
                        //Cria ou substitui o arquivo com o nome informado usando FileWriter
                        FileWriter arquivo = new FileWriter(nomeArquivo);
                        //Escreve o conteúdo digitado pelo usuário dentro do arquivo
                        arquivo.write(conteudo);
                        arquivo.close();//Fecha o arquivo apos ser escrito
                        System.out.println("Arquivo '" + nomeArquivo + "' criado com sucesso!");
                    } catch (IOException e) {//Captura exeção caso ocorra algum erro em relação ao arquivo, e imprime a mensagem de erro
                        System.out.println("Erro ao criar o arquivo");
                        e.printStackTrace();
                    }
                    break;
                //Caso o usuario digite 2, entrará a rotina de mostrar o conteudo do novo arquivo criado
                case 2:
                    // Verifica se o nome do arquivo não foi atribuído
                    if (nomeArquivo == null) {
                        System.out.println("Nenhum arquivo foi criado ainda");
                    } else {
                        try {
                            //Cria um BufferedReader para ler o arquivo linha por linha
                            BufferedReader scanner = new BufferedReader(new FileReader(nomeArquivo));
                            String linha; //Variável para armazenar cada linha lida do arquivo
                            //Loop para ler o arquivo linha por linha até o final
                            System.out.println("\nConteudo do arquivo '" + nomeArquivo + "':");
                            while ((linha = scanner.readLine()) != null) {
                                System.out.println(linha);
                            }
                            //Fecha o BufferedReader para liberar o recurso após a leitura
                            scanner.close();
                        } catch (IOException e) {//Captura exceção caso haja algum erro relacionado a leitura do arquivo, exibindo a mensagem
                            System.out.println("Erro ao ler o arquivo");
                            e.printStackTrace();
                        }
                    }
                    break;
                //Caso o usuario digite 3, entrará na rotina de apagar o arquivo criado
                case 3:
                    //Verifica se o nome do arquivo foi definido
                    if (nomeArquivo == null) {
                        System.out.println("Nenhum arquivo foi criado para ser apagado");
                    } else {
                        //Cria um objeto File para representar o arquivo com o nome especificado
                        File arquivo = new File(nomeArquivo);
                        //Verifica se o arquivo existe
                        if (arquivo.exists()) {
                            //Tenta apagar o arquivo usando o método delete()
                            if (arquivo.delete()) {
                                
                                System.out.println("Arquivo '" + nomeArquivo + "' apagado com sucesso!");
                                nomeArquivo = null; // Zera o nome pois o arquivo foi deletado
                            } else {
                                //Se o arquivo não pôde ser apagado, exibe mensagem de erro
                                System.out.println("Erro ao apagar o arquivo.");
                            }
                        } else {
                            //Se o arquivo não pôde ser encontrado, exibe mensagem de erro
                            System.out.println("Arquivo nao encontrado");
                        }
                    }
                    break;
                //Caso o usuario digite 4, o programa é encerrado
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente");
            }

        } while (opcao != 4);

        leitor.close();
    }
}
