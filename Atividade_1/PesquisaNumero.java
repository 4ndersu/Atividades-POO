import java.util.Scanner;
import java.util.Random;

public class PesquisaNumero {
    public static void main(String[] args){
        //Inicializando o leitor, o vetor, o gerador de valores aleatórios e uma variável booleana para confirmar se o valor buscado foi encotrado
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        int Valores[] = new int[15];
        boolean encontrado = false;

        System.out.print("Array gerado: ");
            for (int contador = 0; contador < Valores.length; contador++) {
                Valores[contador] = random.nextInt(100) + 1; //Gera valores entre 1 e 100
                System.out.print(Valores[contador] + (contador < Valores.length - 1 ? ", " : "\n")); //Imprime os valores gerados
            }

        System.out.print("\nDigite o número que deseja procurar: ");
            int buscador = leitor.nextInt(); //Declara e inicializa a variavel de busca do valor 

        System.out.println();
            //Laço para verificar se o valor inserido está presente no vetor, se sim, armazena o indice do valor coincidente, alem de imprimir o valor e seu respectivo indice 
            for (int contador = 0; contador < Valores.length; contador++) {
                if (Valores[contador] == buscador) {
                    System.out.println("Número " + buscador + " encontrado na posição " + contador);
                    encontrado = true;
                }
            }

                //Se o valor não for encontrado, informa ao usuário
                if (!encontrado) {
                System.out.println("Nenhum valor encontrado no array.");
                }

                leitor.close(); //Fecha o scanner
    }
}
