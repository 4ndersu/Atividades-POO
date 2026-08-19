public class Paciente {
    
    //Declaração de atributos da classe Paciente
    String codigo;
    String nome;
    String dataNascimento;
    char sexo;
    boolean planoSaude=false;
    boolean alergia=false;
    String tipoSanguineo;
    
    //Contrutores dos dados do paciente
    public Paciente(String codigo, String nome, String dataNascimento, char sexo, boolean planoSaude, boolean alergia, String tipoSanguineo){
        this.codigo=codigo;
        this.nome=nome;
        this.dataNascimento=dataNascimento;
        this.sexo=sexo;
        this.planoSaude=planoSaude;
        this.alergia=alergia;
        this.tipoSanguineo=tipoSanguineo;
    }

    //Exibir os atributos do paciente
    public void MostrarStatus(){
        System.out.println("---------PACIENTE----------");  
        System.out.println("Codigo: " + this.codigo);  
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Sexo: " + this.sexo); 
        
        if(this.planoSaude==true){
            System.out.println("Paciente possui plano de saude");
        } else {
            System.out.println("Paciente não possui plano de saude");
        }

        if(this.alergia==true){
            System.out.println("Paciente possui alergia");
        } else {
            System.out.println("Paciente não possui alergia");
        }

        System.out.println("Tipo sanguineo: " + this.tipoSanguineo);       
    }

}
