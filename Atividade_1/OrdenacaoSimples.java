import java.util.Scanner;

public class OrdenacaoSimples {
    public static void main(String[] args){
        //Inicializando o leitor e o vetor para armazenar os nomes
        Scanner leitor = new Scanner(System.in);
        String Nomes[] = new String[8];

            //Laço para armazenar os nomes em cada indice do vetor
            for (int contador = 0; contador < Nomes.length; contador++) {
                System.out.print("Insira o nome " + (contador+1) + ": ");
                Nomes[contador]= leitor.nextLine(); 
            
            }
            
            //Exibir nomes antes da ordenação
            System.out.println("\nLista antes da ordenação:");
            for (String nome :Nomes) {
                    System.out.println(nome);
            }
        
            //Rotina para ordenar os nomes
            for (int i = 0; i < Nomes.length - 1; i++) { //Laço de repetção externo para garantir que o processo seja repetido varias vezes 
                //Laço de repetição interno que percosse o vetor e compara dois nomes seguidos e troca se estiverem na ordem errada
                for (int j = 0; j < Nomes.length - 1 - i; j++) {  
                    //Se Nomes[j] vem depois de Nomes[j+1] na ordem alfabética, retorna um valor maior que 0 e entra no bloco de if para serem trocados
                        if (Nomes[j].compareToIgnoreCase(Nomes[j + 1]) > 0) {  
                            // Troca os elementos de posição
                            String temp = Nomes[j];  
                            Nomes[j] = Nomes[j + 1];  
                                Nomes[j + 1] = temp;  
                        }
                 }

            }

        //Exibir nomes depois da ordenação
        System.out.println("\nLista depois da ordenação:");
        for (String nome : Nomes) {
            System.out.println(nome);
        }

    
    leitor.close(); //Fecha o scanner
    }
}
