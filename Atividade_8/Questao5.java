package atividade8poo;

import java.io.*;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caminhoOrigem = null;
        int opcao;
        
        //Loop para exibir o menu de opções
        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Informar caminho de um arquivo");
            System.out.println("2 - Fazer backup para backup.txt");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                //Caso o usuario digite 1, entrará na rotina de expecificar o caminho do arquivo txt a ser feito o backup
                case 1:
                    //Digitar o caminho do arquivo de texto
                    System.out.print("Digite o caminho completo do arquivo: ");
                    caminhoOrigem = scanner.nextLine();

                    //Verifica de o arquivo existe no caminho especificado
                    File arquivo = new File(caminhoOrigem);
                    //Se não existir exibe uma mensagem de erro e limpa o campo do caminho para ser inserido novamente
                    if (!arquivo.exists()) {
                        System.out.println("Arquivo não encontrado. Tente novamente.");
                        caminhoOrigem = null;
                    } else {
                        //Caso exista, mostra uma mensagem de sucesso
                        System.out.println("Arquivo encontrado e pronto para backup.");
                    }
                    break;
                //Caso o usuario digite 2, entrará na rotina de copiar o conteudo do arquivo de texto do caminho especificado para backup.txt
                case 2:
                    if (caminhoOrigem == null) {
                        System.out.println("Nenhum arquivo valido informado");
                    } else {
                        try (FileInputStream fis = new FileInputStream(caminhoOrigem); //Abre o arquivo de origem para leitura de bytes
                             FileOutputStream fos = new FileOutputStream("backup.txt")) { //Cria ou substitui o arquivo de backup para escrita de bytes

                            int byteLido;//Variável para armazenar temporariamente cada byte lido do arquivo
                            //Loop que lê os bytes um por um até chegar ao final do arquivo
                            while ((byteLido = fis.read()) != -1) {
                                fos.write(byteLido); //Escreve cada byte lido no novo arquivo de backup
                            }
                            //Mensagem de sucesso caso tenha sido armazenado corretamente
                            System.out.println("Backup realizado com sucesso!");
                        } catch (IOException e) {//Lança a exceção caso ocorra algum erro de entrada/saída ou o backup não seja feito corretamente
                            System.out.println("Erro ao realizar o backup:");
                            e.printStackTrace();
                        }
                    }
                    break;
                //Caso o usuario digite 3, encerra o programa
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
