public class Aluno {

    //Declara os atributos da classe Aluno
    String nome;
    String cpf;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    //Declara os construtores nome e cpf para o objeto da classe 
    public Aluno(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }

    //Função que retorna a média de notas do aluno recebendo suas 4 notas como parametro
    public double CalcularMedia(double nota1, double nota2, double nota3, double nota4){
        double soma=0;
        double media=0;
        soma=(nota1 + nota2 + nota3 + nota4);

        media=soma/4;

        return media;  
    }

    //Função que mostra as 4 notas do aluno
    public void MostrarNotas(){
        System.out.println("Notas do aluno: " + this.nome + " CPF: " + this.cpf);
        System.out.println("Primeira nota: " + this.nota1);
        System.out.println("Segunda nota: " + this.nota2);
        System.out.println("Terceira nota: " + this.nota3);
        System.out.println("Quarta nota: " + this.nota4);
    }


}