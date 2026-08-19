package atividade3poo;


public class Biblioteca {
    //Cria um array de livros
    private Livro[] livros;
    private int quantLivros;

    public Biblioteca(){
        //Instancia um array de objetos da classe Livro
        livros= new Livro[100];
        quantLivros=0;
    }
    
    //Função para adicionar livro
    public void adicionarLivro(Livro livro){
        //Enquanto a quantidade de livros for abaixo da capacidade máxima, adiciona livro a um indice do array
        if( quantLivros<livros.length){
            livros[quantLivros] = livro;
            quantLivros++;
         System.out.println("Livro adicionado.");
    } else {
        System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
    }
    }

    //Função para listar s livros
    public void ListarLivros(){
        //Tratamento caso não tenha nenhum livro na biblioteca 
        if (quantLivros == 0) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
    
        System.out.println("Livros na biblioteca:");
        //Lista os livros adicionados através de um laço de repetição
        for(int contador = 0; contador < quantLivros; contador++){
            Livro liv = livros[contador];
            System.out.println("Título: " + liv.getTitulo());
            System.out.println("Autor: " + liv.getAutor());
            System.out.println("Ano: " + liv.getAnoPublicacao());
            System.out.println("---------------------------");
        }
    }
    


}