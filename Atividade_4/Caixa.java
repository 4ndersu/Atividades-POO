package atividade4poo;

public class Caixa {
    
    //Atributos da classe Caixa
    private String identificador;
    private String conteudo;
    private double peso;
    private double altura;

    //Getters e Setters
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        if(identificador!=null){
        this.identificador = identificador;
        } else {
            System.out.println("Identificador invalido!");
        }
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        
        if(conteudo!=null){
            this.conteudo = conteudo;
            } else {
                System.out.println("Conteudo invalido!");
            }
        
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {

        if(peso>0){
        this.peso = peso;
        } else {
            System.out.println("Peso invalido!");
        }
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura>0){
        this.altura = altura;
        } else {
            System.out.println("Altura invalida");
        }
    }

    //Construtor 
    public Caixa(String identificador, String conteudo, double peso, double altura) {
        setIdentificador(identificador);
        setConteudo(conteudo);
        setPeso(peso);
        setAltura(altura);
    }
    
    //Metodo para exibir etiqueta de cada caixa
    public void ExibirEtiqueta(){
        if(getAltura()>0 && getPeso()>0 && getIdentificador()!=null && getConteudo()!=null){
            System.out.println("-----ETIQUETA-----");
            System.out.println("IENTIFICADOR: " + getIdentificador());
            System.out.println("CONTEUDO: " + getConteudo());
            System.out.printf("PESO: %.2fkg%n", getPeso());
            System.out.printf("ALTURA: %.2fm%n", getAltura());
            }
    }

    //Metodo para verificar se a caixa suporta o peso acima
    public boolean suportaPesoAcima(double pesoAcima) {
        return true;
    }

}
