import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //Inicializando o leitor das notas
        double SomaNota=0, Media=0; //Inicializando as variáveis de soma e média das notas
        int AcimaMedia=0; //Inicializando a variável que armazenará as notas acima da média calculada
        double Nota[];
        Nota= new double [5];//Inicializando o vetor que armazenará as cinco notas

            //Laço de repetição para armazenar o valor de cada uma das cinco notas, e também armazenar a soma das notas para a média ser calculada       
            for(int contador=0; contador<Nota.length ; contador++){
                System.out.println("Nota " + (contador+1) + " do aluno:");
                Nota[contador] = leitor.nextDouble();
                
                SomaNota+=Nota[contador]; //
            }
        leitor.close(); //Fechar o Scanner

        Media=SomaNota/Nota.length; //Calcula a média dividindo a soma das notas pela quantidade de notas inseridas(Ou o tamanho do vetor, que é 5) 
        
        //Outro laço de repetição para armazenar a quantidade de notas que ficaram acima da média calculada
        for(int contador=0; contador<Nota.length; contador++){
            if(Nota[contador]>Media){
                AcimaMedia++;
            }      
        }

        //Saida dos resultados de média e quantidade de notas acima da média
        System.out.println("\nMedia das notas: " + Media);
        System.out.println("\nNotas acima da media: " + AcimaMedia);
        
    }
}