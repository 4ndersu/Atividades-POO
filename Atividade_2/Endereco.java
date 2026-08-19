public class Endereco {
    
    //Declaração dos atributos da classe Endereço
    String rua;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    String cep;

    //Construtores da classe endereço
    public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String uf, String cep){
        this.rua=rua;
        this.numero=numero;
        this.complemento=complemento;
        this.bairro=bairro;
        this.cidade=cidade;
        this.uf=uf;
        this.cep=cep;
    }

    //Metodo de imprimir os atributos de Endereço
    public void MostrarEndereco(){
        System.err.println("Endereco do Medico : " + this.rua + " " + this.numero + " " + this.complemento + " " + this.bairro + " " +this.cidade + " " + this.uf + " " + this.cep);
    }

    
}
