public class Lutador {
    //Delcara os atributos da classe Lutador
    String nome;
    Double energia=0.0;
    Double forca=0.0;

    //Declara os construtores da classe Lutador
    public Lutador(String nome, double energia, double forca){
        this.nome=nome;
        this.energia=energia;
        this.forca=forca;
    }

    //Função para contabilizar o dano recebito na energia do lutador
    public void reduzirEnergia(double dano){
        this.energia-=dano;
    }

    //Função de aplicar golpe no lutador adversário como parametro
    public void aplicarGolpe(Lutador recebe){
        recebe.reduzirEnergia(this.forca);
        //Mostra o dano recebido 
        System.out.println("Lutador " + recebe.nome + " sofre " + this.forca + " de dano.");
    }

    //Exbiir estado atual do lutador
    public void MostrarStatus(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Energia: " + this.energia);
        System.out.println("Forca: " + this.forca);
    }
}
