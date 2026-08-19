package atividade6poo;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    
    private Set<String> palavras;

    //Construtor que inicializa o Set com palavras separadas por virgula
    public ConjuntoDePalavras(String entrada) {
        this.palavras = new HashSet<>();
        for (String palavra : entrada.split("\\s*,\\s*")) { //Laço de repetição que divide a String em partes, no caso da questão, por virgula com ou sem espaços
            palavras.add(palavra.trim()); //Remove os espaços em branco do início e do fim da String e adiciona no Set do conjunto de palavras
        }
    }

    public boolean contemTodas(String entrada) {
        // Divide a string de entrada em um array de palavras
        String[] palavrasEntrada = entrada.split("\\s*,\\s*");
        // Percorre cada palavra da entrada
        for (String palavra : palavrasEntrada) {
            //Remove espaços da palavra e verifica se ela não está no conjunto através da estrutura de decisão
            if (!palavras.contains(palavra.trim())) {
                return false;//Retorna falso se pelo menos uma palvra do conjunto de entrada não estiver no conjunto
            }
        }
        return true;//Retorna true se todas as palavras de entrada estiverem no conjunto
    }

    public static void main(String[] args) {
        //QUESTÃO 4: Conjunto de palavras
        //Objeto do conjunto de palavras
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras("bola, lapis, carro, bicicleta");
        System.out.println("Conjunto de palavras original: bola, lapis, carro, bicicleta ");
        
        System.out.println("Entrada 1: bola, bicicleta.");
        System.out.println("BOLA e BICICLETA estão no conjunto de palavras, logo:");
        System.out.println(conjunto.contemTodas("bola, bicicleta"));

        System.out.println("Entrada 2: carro, videogame.");
        System.out.println("CARRO está no conjunto mas VIDEOGAME não, logo:");
        System.out.println(conjunto.contemTodas("carro, videogame"));
    }
}
