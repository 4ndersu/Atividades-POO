package atividade4poo;

//Classe caixa fragil que herda Caixa
public class CaixaFragil extends Caixa {

    //Atributo adicional da classe CaixaFragil
    private double pesoMax;

    //Getters e Setters
    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        if(pesoMax>0){
        this.pesoMax = pesoMax;
        } else {
            System.out.println("Peso maximo invalido!");
        }
    }

    //Constutor de caixa fragil utilizando super
    public CaixaFragil(String identificador, String conteudo, double peso, double altura, double pesoMax) {
        super(identificador, conteudo, peso, altura);
        setPesoMax(pesoMax);
    }

    //Metodo de exibir etiqueta sobrescrito para a CaixaFragil 
    @Override
    public void ExibirEtiqueta(){
        if(getAltura()>0 && getPeso()>0 && getIdentificador()!=null && getConteudo()!=null){
            System.out.println("-----ETIQUETA-----");
            System.out.println("IENTIFICADOR: " + getIdentificador());
            System.out.println("CONTEUDO: " + getConteudo());
            System.out.printf("PESO: %.2fkg%n", getPeso());
            System.out.printf("ALTURA: %.2fm%n", getAltura());
            System.out.printf("PESO MAXIMO SUPORTADO ACIMA: %.2fkg%n", getPesoMax());
            }
    }
    
    //Metodo de verificar se suporta peso acima sobrescrito para CaixaFragil
    @Override
    public boolean suportaPesoAcima(double pesoAcima) {
        return pesoAcima <= pesoMax;
    }
    
}
