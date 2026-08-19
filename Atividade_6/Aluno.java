package atividade6poo;

public class Aluno {

    //Atributos da classe Aluno
    private int matricula, idade;
    private String nome, curso;

    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Construtor com os ostributos de parametros
    public Aluno(int matricula, int idade, String nome, String curso) {
        setMatricula(matricula);
        setIdade(idade);
        setNome(nome);
        setCurso(curso);
    }

    //Metodo toString da classe Object sobrescrito para imprimir corretamente os dados de cada aluno
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    }
    
