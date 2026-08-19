package atividade6poo;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    
    //Lista de alunos como atributo da classe
    private static List<Aluno> alunos = new ArrayList<>();

    //Getters e Setters 
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        CadastroAluno.alunos = alunos;
    }

    //Construtor 
    public CadastroAluno() {
        CadastroAluno.alunos = new ArrayList<>();
    }
    
    //Metodo de adicionar os dados do aluno na lista de alunos
    public static void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    //Metodo para listar os alunos da lista(usando o toString sobrescrito) 
    public static void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void main(String[] args) {
        //QUESTÃO 3: Cadastro de alunos
        //Cris 10 objetos da classe Aluno
        Aluno a1 = new Aluno(1001, 20, "Ana Silva", "Engenharia");
        Aluno a2 = new Aluno(1002, 22, "Bruno Costa", "Administração");
        Aluno a3 = new Aluno(1003, 21, "Carla Souza", "Direito");
        Aluno a4 = new Aluno(1004, 23, "Daniel Lima", "Medicina");
        Aluno a5 = new Aluno(1005, 20, "Eduarda Rocha", "Psicologia");
        Aluno a6 = new Aluno(1006, 24, "Felipe Martins", "Ciência da Computação");
        Aluno a7 = new Aluno(1007, 19, "Gabriela Torres", "Design");
        Aluno a8 = new Aluno(1008, 22, "Henrique Alves", "Engenharia");
        Aluno a9 = new Aluno(1009, 21, "Isabela Ramos", "Arquitetura"); 
        Aluno a10 = new Aluno(1010, 23, "João Pedro", "Economia");

        //Adiciona os 10 alunos na lista
        adicionarAluno(a1);
        adicionarAluno(a2);
        adicionarAluno(a3);
        adicionarAluno(a4);
        adicionarAluno(a5);
        adicionarAluno(a6);
        adicionarAluno(a7);
        adicionarAluno(a8);
        adicionarAluno(a9);
        adicionarAluno(a10);

        //Lista os dados de cada aluno
        listarAlunos();
    }
}
