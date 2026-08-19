package atividade4poo;

import java.util.Stack;

public class PilhaDeCaixas {
    //Atributos da classe pilha de caixas
    private double alturaMax;
    private Stack<Caixa> pilha; //Utiliza a estrutura de dados pilha importado da biblioreca Stack do Java

    //Getters e Setters
    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        if(alturaMax>0){
            this.alturaMax = alturaMax;
            } else {
                System.out.println("Altura maxima invalida!");
            }
    }

    //Construtor que inicializa a pilha
    public PilhaDeCaixas(double alturaMax) {
        this.alturaMax = alturaMax;
        pilha = new Stack<>();
    }
   
    //Letra f) - metodo que retorna a altura total da pilha
    public double calcularAlturaAtual() {
        double alturaTotal = 0;
        for (Caixa c : pilha) {
            alturaTotal += c.getAltura();
        }
        return alturaTotal;
    }

    //Letra g) - metodo que retorna o peso total da pilha
    public double calcularPesoAtual() {
        double pesoTotal = 0;
        for (Caixa c : pilha) {
            pesoTotal += c.getPeso();
        }
        return pesoTotal;
    }
    
    //Letra c) - função para empilhar caixas recebendo uma caixa como parametro
    public boolean EmpilharCaixa(Caixa novaCaixa){

        //Variavel para receber a altura atual da pilha
        double alturaAtual = calcularAlturaAtual();
        
        // Verifica se a altura máxima da pilha será ultrapassada
        if ((alturaAtual + novaCaixa.getAltura()) > alturaMax) {
            System.out.println("Altura máxima da pilha atingida!");
            return false;
        }
        
        //Variavel para receber o peso que fica sobre as caixas que já estão na pilha
        double pesoAcima = novaCaixa.getPeso();
        
        // Laço para verificar a segurança da pilha
        for (int i = pilha.size() - 1; i >= 0; i--) {
            Caixa caixa = pilha.get(i); //Pega a caixa atual na pilha
    
            // Verifica se a caixa suporta o peso acima dela
            if (!caixa.suportaPesoAcima(pesoAcima)) {
                System.out.println("Uma caixa na pilha não suporta o peso acima dela.");
                return false;
            }
    
            pesoAcima += caixa.getPeso(); // Acumula o peso acima
        }
    
        // Adiciona a nova caixa na pilha
        pilha.push(novaCaixa);
        return true;
    }
    
    public Caixa DesempilharCaixa(){

        //Verifica se a pilha está vazia
        if(pilha.isEmpty()){
            System.out.println("A pilha está vazia. Não tem caixas para desempilhar.");
            return null;
        }
        //Remove e retorna a caixa do topo da pilha
        Caixa caixaRemovida = pilha.pop();
        //Imprime a caixa que está sendo removida e retorna a caixa desempilhada
        System.out.println("Desempilhando caixa:");
        System.out.println("Caixa desempilhada: " + caixaRemovida.getIdentificador());
        return caixaRemovida;
    }

    //Metodo para mostrar a pilha de caixas
    public void ExibirPilha() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Caixas na pilha:");
            for (Caixa caixa : pilha) {
                caixa.ExibirEtiqueta();
            }
        }
    }
    
}
