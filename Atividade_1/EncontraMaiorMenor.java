import java.util.Scanner;

public class EncontraMaiorMenor {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int Numero[], Maior=0, Menor=0, PosMaior=0,PosMenor=0;//Inicializando as variáveis de maior e menor elemento do vetor, e suas posições
        Numero = new int[10]; //Inicializando o vetor de tamanho 10 para armazenar os numeros inteiros


        //Colocando o valor do primeiro índice diretamente como maior e menor para poder ser comparado corretamente no laço
        System.out.println("Insira o número 1: ");
        Numero[0] = leitor.nextInt();
        Maior = Menor = Numero[0];

            //Laço para armazenar os valores inteiros digitados pelo usuário
            for(int contador=1; contador<Numero.length ; contador++){
                System.out.println("Insira o numero " + (contador+1) + ":");
                Numero[contador] = leitor.nextInt();
                
                
                //Compara o valor do indice atual do vetor com o maior e menor valor armazenado, armazenando o maior valor na variavel Maior e o menor valor na variavel Menor
                if(Numero[contador]>Maior){
                    Maior = Numero[contador];
                    PosMaior = contador;//Armazena a posição do maior valor
                } else if(Numero[contador]<Menor){
                    Menor = Numero[contador];
                    PosMenor = contador;//Armazena a posição do menor valor
                }

             }
        leitor.close(); //Fecha o Scanner

        //Imprime o maior e menor valor do vetor e suas respectivas posições em relação ao vetor(de 0 até n-1) 
        System.out.println("Maior numero: " + Maior + " (posição " + PosMaior + ")");
        System.out.println("Menor numero: " + Menor + " (posição " + PosMenor+ ")");
    }
}
