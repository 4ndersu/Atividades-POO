package atividade3poo;

public class Livro {

    //Declara os atributos da classe Livro 
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //Getters e Setters 
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao ) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }

}
