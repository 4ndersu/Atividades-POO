package atividade7poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        //Variavel para ler a entrada do usuario
        Scanner leitor = new Scanner(System.in);
        //Vetor de inteiros com tamanho fixo 10
        int[] vetor = new int[10];

    //Bloco que pode ocorrer a exceção
    try{
        //Coloquei 15 apenas para ilustrar caso algum indice maior que o declarado seja acessado
        for(int i=0; i<15; i++){
            System.out.println("Valor inteiro " + "[" + (i+1) + "]:" );
            vetor[i] = leitor.nextInt();//Colocar valor digitado no indice
            if(vetor[i] == 0){
                break;//Caso o usuario digite 0, não são mais adicionados novos valores
            }
        }
    //Caso o usuário continue digitando valores alem do permitido no vetor, cai na exceção OutOfBounds e uma mensagem de erro é mostrada
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Erro: todas as posições do vetor ocupadas!");
     //Caso o usuário continue digite algo que não seja um valor inteiro, cai na exceção InputMismatchException e uma mensagem de erro é mostrada
    } catch(InputMismatchException e){
        System.out.println("Erro: apenas valores inteiros!");
    } finally {
        //Mostra o vetor com os valores validos adicionados
        System.out.println("Vetor:\n[");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("]");
        //Fecha o Scanner
        leitor.close();
    }

        
    }
}
