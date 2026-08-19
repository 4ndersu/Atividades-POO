import java.util.Random;

public class ParImpar {
    public static void main(String[] args){
        //Inicializando o vetor, o gerador de valores aleatorios e a quantidade de numeros pares e impares
        Random random = new Random();
        int Valores[] = new int[20], Pares[] = new int[20], Impares[] = new int[20]; //Coloquei um tamanho de vetor estático em pares e impares para garantir em caso de cairem 20 numeros só pares ou impares
        int quantPar=0, quantImpar=0;

        System.out.print("Array gerado: ");
            for (int contador = 0; contador < Valores.length; contador++) {
                Valores[contador] = random.nextInt(50) + 1; //Gera valores entre 1 e 50
                System.out.print(Valores[contador] + (contador < Valores.length - 1 ? ", " : "\n")); //Imprime os valores gerados
            }

        System.out.println();
        System.out.println("Numeros pares: ");
        //Laço para armazenar os valores pares do vetor,utilizando o resto de divisão por 2 igual a 0, a principal caracteristica dos numeros pares  
            for (int contador = 0; contador < Valores.length; contador++) {
                if (Valores[contador] % 2 == 0) {
                    Pares[contador]=Valores[contador];
                    System.out.println(Pares[contador]);//Imprime os valores pares do vetor
                    quantPar++; //Incrementa 1 na quantidade de numeros pares
                }
            
        }

        System.out.println();
        System.out.println("Numeros impares: ");
        //Laço para armazenar os valores impares do vetor, de forma analoga utilizando o resto de divisão por 2 igual a 1, o que caracteriza os numeros impares
            for (int contador = 0; contador < Valores.length; contador++) {
                if (Valores[contador] % 2 == 1) {
                    Impares[contador]=Valores[contador];
                    System.out.println(Impares[contador]); //Imprime os valores pares do vetor
                    quantImpar++; //Incrementa 1 na quantidade de numeros pares
                }
            
            }
        //Imprime a quantidade dos numeros pares e impares do vetor
        System.out.println();
        System.out.println("Quantidade de numeros pares: " + quantPar);
        System.out.println("Quantidade de numeros impares: " + quantImpar);
    }
}
