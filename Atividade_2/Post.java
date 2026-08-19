public class Post {
    
    //Declara os atributos da classe Post
    String texto;
    String link;
    int numeroCurtidas=0;
    int numeroCompartilhamentos=0;

    //Declara os construtores da classe Post
    public Post(String texto, String link, int numeroCurtidas, int numeroCompartilhamentos){
        this.texto=texto;
        this.link=link;
        this.numeroCurtidas=numeroCurtidas;
        this.numeroCompartilhamentos=numeroCompartilhamentos;
    }

    //Função de curtir o post atraves do incremento no atributo numeroCurtidas
    public void Curtir(){
        System.out.println("Post curtido!");
        numeroCurtidas++;
    }
    
    //Função de compartilhar o post atraves do incremento no atributo numeroCompartilhamentos
    public void Compartilhar(){
        System.out.println("Post compartilhado!");
        numeroCompartilhamentos++;
    }

    //Função para exbir o post e seu numero de curtidas e compartilhamentos
    public void MostrarPost(){
        System.out.println("-------FACEBOOK.COM--------");
        System.out.println();
        System.out.println(this.texto);
        System.out.println(this.link);
        System.out.println("Curtidas: " + this.numeroCurtidas);
        System.out.println("Compartilhamentos: " + this.numeroCompartilhamentos);
        System.out.println();
    }
}


