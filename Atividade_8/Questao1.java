package atividade8poo;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Questao1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto que deseja salvar no arquivo:");
        String texto = scanner.nextLine();

        String caminho = "saida.txt";

        //Rotina de escrever no arquivo de texto
        try {
            //Objeto de FileWriter para criar novo arquivo de texto
            FileWriter arquivo = new FileWriter(caminho);
            arquivo.write(texto);//Escrever a string no arquivo de texto
            arquivo.close();//Fecha o arquivo apos o uso
            System.out.println("Arquivo 'saida.txt' salvo com sucesso em " + caminho);
        } catch (IOException e) {//Captura a exceção em caso de erro ao salvar
            System.out.println("Erro: nao foi possivel salvar o arquivo.");
            e.printStackTrace();
        }

        scanner.close();
        //Rotina de ler oo arquivo de texto
        try {
            //Objeto leitor de texto que vai ler um arquivo linha por linha 
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
            String linha;

            //Imprime o que ta escrito no arquivo de texto no console
            System.out.println("Conteúdo do arquivo:");
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            leitor.close();
        } catch (IOException e) {//Lança a exceção caso não consiga ler o arquivo
            System.out.println("Erro ao ler o arquivo");
            e.printStackTrace();
        }
    }
}
