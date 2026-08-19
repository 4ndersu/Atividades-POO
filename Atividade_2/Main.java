public class Main {
    public static void main(String[] args) {
    
        //QUESTÂO 1: PACIENTE

        //Instanciando um objeto da classe Paciente com seus atributos
        Paciente a = new Paciente("123", "Paulo", "27/07/2003", 'M', true, false, "O+");

        //Exibe os dados do paciente
        a.MostrarStatus();
        System.out.println();
        
        //Altera os atributos do paciente
        a.codigo= "456";
        a.nome= "Maria";
        a.dataNascimento= "16/06/1998";
        a.sexo='F';
        a.planoSaude=false;
        a.alergia=true;
        a.tipoSanguineo= "A-";
        
        //Imprime os atributos alterados do paciente
        a.MostrarStatus();
        System.out.println();

        //QUETSÃO 2: MEDICO E ENDEREÇO

        //Instanciando objetos das classes Endereço e Medico, e declarando seus atibutos de endereço e dados pessoais
        Endereco EnderecoMed1 = new Endereco("Avenida das Palmeiras", "121", "Apartamento 45B", "Centro", "São Paulo", "SP", "01010-000");
        Medico Med1 = new Medico("403", "Dr. Marcelo Oliveira", "M", "Cardiologia", EnderecoMed1);
        
        //Exibir dados do objeto medico
        Med1.MostrarStatusMed();
        System.out.println();
        
        //Alterando dados pessoais do medico
        Med1.codigo = "240";
        Med1.nome = "Dra. Carolina Mendes";
        Med1.sexo = "F";
        Med1.especialidade = "Dermatologia";

        //Alterando o endereço do objeto medico através da função na classe Medico 
        Med1.AlterarEndereco("Rua dos Ipês", "567", "Bloco C, Sala 12", "Jardim das Flores", "Curitiba", "PR", "00530-200");
        
        
        //QUESTÂO 3: LUTADOR
        //Instancia os objetos dos lutadores da classe Lutador
        Lutador Ryu = new Lutador("Ryu", 100, 10);
        Lutador Bison = new Lutador("Bison", 100, 12);

        //Exibe os atributos de Bison antes de sofrer os golpes de Ryu
        Bison.MostrarStatus();
        System.out.println();
        
        //Chama a função de aplicar os golpes de Ryu em Bison tres vezes
        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);
        System.out.println();

        //Exibe os atributos de Bison depois de sofrer os golpes de Ryu
        Bison.MostrarStatus();
        System.out.println();

        //Exibe os atributos de Ryu antes de sofrer os golpes de Bison
        Ryu.MostrarStatus();
        System.out.println();

        //Chama a função de aplicar os golpes de Bison em Ryu oito vezes
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        System.out.println();
        
        //Exibe os atributos de Ryu depois de sofrer os golpes de Bison
        Ryu.MostrarStatus();

        

        //QUESTÂO 4: POST
        //Instancia um objeto da classe Post e define seus atributos
        Post Postagem = new Post("Tá faltando um jogo aí, mas blz", "youtube.com", 0, 0);

        //Exibe o post e seu numero de curtidas e compartilhamentos atual
        Postagem.MostrarPost();

        //Chama a função de curtir o post tres vezes
        Postagem.Curtir();
        Postagem.Curtir();
        Postagem.Curtir();
        System.out.println();
        
        //Exibe o post e seu numero de curtidas e compartilhamentos após as curtdas
        Postagem.MostrarPost();

        //Chama a função de compartilhar o post duas vezes
        Postagem.Compartilhar();
        Postagem.Compartilhar();
        System.out.println();
        
        //Exibe o post e seu numero de curtidas e compartilhamentos após as curtdas e os compartilhamentos
        Postagem.MostrarPost();

        //QUESTÂO 5: ALUNO
        
        //Instancia um objeto da classe Aluno com seu respectivo nome e cpf
        Aluno aluno1 = new Aluno("Anderson Vicente de Freitas","445.987.123-90" );

        //Define as 4 notas do aluno
        aluno1.nota1=8;
        aluno1.nota2=7.5f;
        aluno1.nota3=10;
        aluno1.nota4=9;

        //Chamada da função de mostrar as notas
        aluno1.MostrarNotas();
        
        //Calcula a média das 4 notas inseridas do aluno
        double MediaInicial =aluno1.CalcularMedia(aluno1.nota1, aluno1.nota2, aluno1.nota3, aluno1.nota4);
        
        System.out.println();
        
        //Imprime a média antes da alteração da segunda nota
        System.out.println("Media inicial das notas: " + MediaInicial);
        
        //Segunda nota é alterada
        aluno1.nota2=10;
        //Calcula a média das 4 notas inseridas do aluno(com a segunda nota alterada)
        double MediaFinal =aluno1.CalcularMedia(aluno1.nota1, aluno1.nota2, aluno1.nota3, aluno1.nota4);
        //Imprime a segunda nota alterada
        System.out.println();
        System.out.println("Nota 2 alterada para " + aluno1.nota2);
        //Imprime a nova média
        System.out.println("Media final das notas: " + MediaFinal);
    }   
}
