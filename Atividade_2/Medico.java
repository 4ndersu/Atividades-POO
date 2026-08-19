public class Medico {
    //Declara os atributos da clase Médico
    String codigo;
    String nome;
    String sexo;
    String especialidade;
    //Instancia um objeto da classe Endereço para a classe Médico
    Endereco EndMed = new Endereco(null, null, null, null, null, null, null);
    
    //Construtor da classe médico, tanto seus dados pessoais quanto seu respectivo endereço
    public Medico(String codigo, String nome, String sexo, String especialidade, Endereco EndMed){
        this.codigo=codigo;
        this.nome=nome;
        this.sexo=sexo;
        this.especialidade=especialidade;
        this.EndMed.rua=EndMed.rua;
        this.EndMed.numero=EndMed.numero;
        this.EndMed.complemento=EndMed.complemento;
        this.EndMed.bairro=EndMed.bairro;
        this.EndMed.cidade=EndMed.cidade;
        this.EndMed.uf=EndMed.uf;
        this.EndMed.cep=EndMed.cep;
    }

    //Metodo para exibir dados pessoais e endereço do médico
    public void MostrarStatusMed(){
        System.out.println("---------MEDICO----------");
        System.out.println("Codigo: " + this.codigo);  
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Especialidade: " + this.especialidade);
        //Chamada da função MostrarEndereço da classe Endereço ao objeto EndMed 
        EndMed.MostrarEndereco(); 
    }
    
    //Função que altera o endereço do médico
    public void AlterarEndereco(String novaRua, String novoNumero, String novoComplemento, String novoBairro, String novaCidade, String novoUF, String novoCEP){
        this.EndMed.rua=novaRua;
        this.EndMed.numero=novoNumero;
        this.EndMed.complemento=novoComplemento;
        this.EndMed.bairro=novoBairro;
        this.EndMed.cidade=novaCidade;
        this.EndMed.uf=novoUF;
        this.EndMed.cep=novoCEP;
        System.out.println("Dados alterados!");
        MostrarStatusMed();
    };

}

