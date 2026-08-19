package atividade3poo;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade>0){
        this.idade = idade;
        } else {
            System.out.println("Idade invalida, somente valores positivos.");
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if(altura>0){
            this.altura = altura;
            } else {
                System.out.println("Altura invalida, somente valores positivos.");
            }
    }

    public Pessoa(String nome, int idade, double altura){
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
    }

    public void StatusPessoa(){
        
        if(getAltura()>0 && getIdade()>0){
        System.out.println("-----STATUS DA PESSOA-----");
        System.out.println("NOME: " + getNome());
        System.out.println("IDADE: " + getIdade());
        System.out.printf("ALTURA: %.2f%n", getAltura());
        }
    }

}
