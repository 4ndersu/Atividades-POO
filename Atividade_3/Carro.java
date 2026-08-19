package atividade3poo;

import java.util.Scanner;

public class Carro{
    
    Scanner leitor = new Scanner(System.in);

    //Declara os atributos da classe carro
    //Atributos privados para não ter acesso direto aos atributos fora da classe
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual; //Em Km/h
    private int marchaAtual=1;
    //Boolean para retornar se o carro é recente ou não
    private boolean recente;
    
    /*Construtor antigo da questão 1
    //Declara os atributos da classe carro
    public Carro(String marca, String modelo , String ano, double velocidadeAtual){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.velocidadeAtual=velocidadeAtual;
    }
*/
   //Getters e Setters dos atributos(encapsulamento)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null){
            System.out.println("Marca invalida de carro.");
        } else{
        this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null){
            System.out.println("Modelo invalido de carro.");
        } else{
        this.modelo = modelo;
        }
    }

    public int getAno() {
        return ano;
    }


/* 
    //Metodo Set antigo de Carro, da Questão 1
    public void setAno(int ano) {
        
        if(getAno() < 1886){
            System.out.println("Ano invalido de carro.");
        } else{
        this.ano = ano;
        }
    }
*/

    //Metodo Set antigo de Carro, da Questão 1
    public void setAno(int ano) {
        this.ano=ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }


    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        if(marchaAtual>=1 && marchaAtual <=5){
            this.marchaAtual = marchaAtual;
    }
}
    //Construtor dos atributos da classe Carro
    public Carro(String marca, String modelo , int ano, double velocidadeAtual, int marchaAtual){
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setVelocidadeAtual(velocidadeAtual);
        setMarchaAtual(marchaAtual);
        //Modificação para mostrar True se for apos ou igual a 2020 e false se não
        if(getAno() < 2020){
            recente=false;
        } else{
            recente=true;
        }
    }

    //Função para acelerar o carro
    public void acelerar(double aceleracao){
        this.setVelocidadeAtual(this.getVelocidadeAtual() + aceleracao);
        System.out.println("Acelerou " + aceleracao + " unidades.\n");
    }

    //Função para freiar o carro
    public void frear(double freio){
        this.setVelocidadeAtual(this.getVelocidadeAtual() - freio);

        //Verifica se a velocidade do carro vai ficar menor que zero
        if(this.getVelocidadeAtual() < 0){
            System.out.println("Nao foi possivel freiar.");
        } else{
            System.out.println("Freou " + freio + " unidades.\n");
        }
    }

    //Função para exibir os detahes do carro
    public void exibirDetalhes(){
    System.out.println("--------INFORMACOES DO CARRO--------");

    if(marca!=null){
    System.out.println("MARCA: " + getMarca());
    }

    if(modelo!=null){
    System.out.println("MODELO: " + getModelo());
    }

    if(ano > 1886){
    System.out.println("ANO: " + getAno());
    System.out.println("VELOCIDADE ATUAL: " + getVelocidadeAtual() + "Km/h");
    System.out.println();
    }
    }

    //Função para trocar a marcha do carro
    public void trocarMarcha(int novaMarcha){
    
    //Verifica se as marchas são iguais, para poder fazer troca apenas se forem diferentes, com os intervalos certos
    if (novaMarcha == marchaAtual) {
        System.out.println("O carro já está na marcha " + novaMarcha + ".");
        } else { 
    if(novaMarcha==1 && getVelocidadeAtual()<=20){
        marchaAtual=novaMarcha;
        System.out.println("Marcha trocada para " + novaMarcha);
    } else if(novaMarcha==2 && getVelocidadeAtual()>20 && getVelocidadeAtual() <=40){
        marchaAtual=novaMarcha;
        System.out.println("Marcha trocada para 2");
    }  else if (novaMarcha == 3 && getVelocidadeAtual() > 40 && getVelocidadeAtual() <= 60) {
        marchaAtual = novaMarcha;
        System.out.println("Marcha trocada para 3");
    } else if (novaMarcha == 4 && getVelocidadeAtual() > 60 && getVelocidadeAtual() <= 80) {
        marchaAtual = novaMarcha;
        System.out.println("Marcha trocada para 4");
    } else if (novaMarcha == 5 && getVelocidadeAtual() > 80) {
        marchaAtual = novaMarcha;
        System.out.println("Marcha trocada para 5");
    } else {
        System.out.println("Velocidade atual incompatível com a marcha " + novaMarcha + ".");
    }
        }
    }
//-----------------------QUESTÃO 13-----------------------------------

    //Rotina de impressão de atributos semelhante a questão 1
    public void ExibirCarro(){
        System.out.println("--------INFORMACOES DO CARRO--------");

        if(marca!=null){
        System.out.println("MARCA: " + getMarca());
        }
    
        if(modelo!=null){
        System.out.println("MODELO: " + getModelo());
        }

        System.out.println("ANO: " + getAno());

        //Diferença que mostra se o carro é recente ou não 
        if(recente){
            System.out.println("Carro é recente!\n");
        } else {
            System.out.println("Carro não é recente\n");
        }
    }
}