package atividade3poo;

public class Aluno{
            //Declara os atributos da classe ALuno
            private String nome;
            private double notaFinal;

            //Getters e setters
            public String getNome(){
                return nome;
            }

            public void setNome(String nome){
                this.nome=nome;
            }

            public double getNotaFinal(){
                return notaFinal;
            }

            public void setNotaFinal(double notaFinal){
                this.notaFinal=notaFinal;
            }

            public Aluno(){
                setNome(nome);
                setNotaFinal(notaFinal);
            }

        
        //Função para inicializar o array de alunos
        public static void ArmazenarAlunos(Aluno[] aluno){

                for(int contador=0;contador<=(aluno.length-1); contador++){
                    aluno[contador]= new Aluno();
                }
            }
        //Metodo para calcular média recebendo o array como parametro
        public static void CalcularMedia(Aluno[] notas) {
            double somaNotas = 0;
            int alunosValidos = 0;
            
            //Verificar a quantidade de alunos para calcular a media corretamente
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] != null && notas[i].getNotaFinal() > 0) {
                    somaNotas += notas[i].getNotaFinal();
                    alunosValidos++;
                }
            }
                //Calcula a média e imprime o resultado das soma e da média do array
                if (alunosValidos > 0) {
                    double mediaNotas = somaNotas / alunosValidos;
                    System.out.println("Soma das notas: " + somaNotas);
                    System.out.println("Média das notas: " + mediaNotas);
                } else {
                    System.out.println("Nenhum aluno válido para calcular média.");
                }
            }
            
}