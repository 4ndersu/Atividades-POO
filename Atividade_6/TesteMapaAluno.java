package atividade6poo;

import java.util.HashMap;
import java.util.Scanner;

public class TesteMapaAluno {
   public static void main(String[] args) {

        //QUESTÃO 5: HashMap de Aluno
        //Objeto para entrada do usuário
        Scanner leitor = new Scanner(System.in);

        //5 objetos da classe Aluno
        Aluno a1 = new Aluno(2023001, 20, "Ana Silva", "Engenharia");
        Aluno a2 = new Aluno(2023002, 22, "Bruno Costa", "Direito");
        Aluno a3 = new Aluno(2023003, 19, "Carla Souza", "Medicina");
        Aluno a4 = new Aluno(2023004, 21, "Diego Lima", "Ciência da Computação");
        Aluno a5 = new Aluno(2023005, 23, "Eduarda Rocha", "Arquitetura");

        //Map que recebe o numero da matricula como chave, e objeto Aluno como valor
        HashMap<Integer, Aluno> alunos = new HashMap<>();

        //Adiciona os alunos no Map
        alunos.put(a1.getMatricula(), a1);
        alunos.put(a2.getMatricula(), a2);
        alunos.put(a3.getMatricula(), a3);
        alunos.put(a4.getMatricula(), a4);
        alunos.put(a5.getMatricula(), a5);

        //Pede ao usuario o numero da matricula do aluno
        System.out.println("Numero da matricula: ");
        int matricula = leitor.nextInt();

        leitor.close();

        
        //Verifica se o valor da matricula digitada é igual a do Map
        if (alunos.containsKey(matricula)){
        //Se sim, as informações do aluno são imprimidas
            System.out.println("Aluno: " + alunos.get(matricula) );
        } else {
            System.out.println("Aluno não encontrado.");
        }

    }
}
