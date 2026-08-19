package atividade9poo;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

//Classe que representa um arquivo com nome e tamanho em kb
class Arquivo {
    private String nome;
    private double tamanhoKB;

    //Getter para tamanho do arquivo
    public double getTamanhoKB() {
        return tamanhoKB;
    }

    //Construtor de arquivo
    public Arquivo(String nome, double tamanhoKB) {
        this.nome = nome;
        this.tamanhoKB = tamanhoKB;
    }

    //Sobrescrita do metodo toString para exibir o nome e o tamanho do arquivo
    @Override
    public String toString() {
        if (tamanhoKB >= 1024) {
            //MB se o tamanho for maior ou igual a 1024KB
            return nome + " (" + String.format("%.2f MB", tamanhoKB / 1024) + ")";
        } else {
            return nome + " (" + String.format("%.0f KB", tamanhoKB) + ")";
        }
    }
}
//Classe que herda JPanel
public class Questao5 extends JPanel {

    public Questao5() {
         //Define o layout do painel principal
        setLayout(new BorderLayout());

        //Cria o nó raiz da arvore
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("C:");

        //Cria um diretório como nó da árvore, com nome Fotos
        DefaultMutableTreeNode fotos = new DefaultMutableTreeNode("Fotos");
        //Adiciona arquivos ao diretório Fotos
        fotos.add(new DefaultMutableTreeNode(new Arquivo("logo.png", 900)));
        fotos.add(new DefaultMutableTreeNode(new Arquivo("imagem.png", 2048)));
        fotos.add(new DefaultMutableTreeNode(new Arquivo("capaFacebook.png", 360)));

        //Cria um diretório como nó da árvore, com nome Documentos
        DefaultMutableTreeNode documentos = new DefaultMutableTreeNode("Documentos");
        //Adiciona arquivos ao diretório Documentos
        documentos.add(new DefaultMutableTreeNode(new Arquivo("resumo.pdf", 80)));
        documentos.add(new DefaultMutableTreeNode(new Arquivo("planilha.csv", 500)));
        documentos.add(new DefaultMutableTreeNode(new Arquivo("trabalho.docx", 120)));

        //Adiciona o nó Fotos e Documentos para a raiz C:
        raiz.add(fotos);
        raiz.add(documentos);

        //Cria o JTree usando o no raiz como modelo de dados
        final JTree arvore = new JTree(raiz);
        //Cria um painel de rolagem para a arvore
        final JScrollPane scrollPane = new JScrollPane(arvore);
        //Cria JRadioButtons de opção para ordenar em ordem alfabetica e ordem por tamanho
        final JRadioButton alfabetica = new JRadioButton("Ordem alfabatica");
        final JRadioButton tamanho = new JRadioButton("Ordem por tamanho");

        //Cria um grupo de botoes e adiciona ordenaçao alfabetica e por tamanho
        final ButtonGroup botoes = new ButtonGroup();
        botoes.add(alfabetica);
        botoes.add(tamanho);

        //Cria um painel para agrupar os botoes de opção
        JPanel botoesPainel = new JPanel();
        botoesPainel.add(alfabetica);
        botoesPainel.add(tamanho);

        //Adiciona o painel de rolagem da arvore no centro do painel principal
        add(scrollPane, BorderLayout.CENTER);
        add(botoesPainel, BorderLayout.SOUTH);

        //Adiciona um listener ao botao Ordem alfabetica
        alfabetica.addActionListener(e -> {
            //Obtem a raiz da árvore C:
            DefaultMutableTreeNode raiz1 = (DefaultMutableTreeNode) arvore.getModel().getRoot();
            
            //Laco de repeticao para cada diretorio filho da raiz
            for (int i = 0; i < raiz1.getChildCount(); i++) {
                DefaultMutableTreeNode diretorio = (DefaultMutableTreeNode) raiz1.getChildAt(i);
                //Cria uma lista temporaria para armazenar os arquivos desse diretorio
                java.util.List<DefaultMutableTreeNode> arquivos = new java.util.ArrayList<>();
                
                //Copia todos os arquivos filhos do diretorio para a lista temporaria
                for (int j = 0; j < diretorio.getChildCount(); j++) {
                    arquivos.add((DefaultMutableTreeNode) diretorio.getChildAt(j));
                }
                //Ordena a lista de arquivos pela representacao em String
                arquivos.sort((a, b) -> a.toString().compareToIgnoreCase(b.toString()));

                //Limpa o diretorio original e remove todos os arquivos filhos do diretorio 
                diretorio.removeAllChildren();
                
                //Adiciona os arquivos ordenados de volta ao diretório
                for (DefaultMutableTreeNode arquivo : arquivos) {
                    diretorio.add(arquivo);
                }
            }
            //Atualiza visualmente a arvore para mostrar ordenada
            ((DefaultTreeModel) arvore.getModel()).reload();
        });

        //Adiciona um listener ao botao Ordem por tamanho
        tamanho.addActionListener(e -> {
            DefaultMutableTreeNode raiz1 = (DefaultMutableTreeNode) arvore.getModel().getRoot();
            //Laco de repeticao para cada diretorio filho da raiz
            for (int i = 0; i < raiz1.getChildCount(); i++) {
                DefaultMutableTreeNode diretorio = (DefaultMutableTreeNode) raiz1.getChildAt(i);
                //Cria uma lista temporaria para armazenar os arquivos desse diretorio
                java.util.List<DefaultMutableTreeNode> arquivos = new java.util.ArrayList<>();

                //Copia todos os arquivos filhos do diretorio para a lista temporaria
                for (int j = 0; j < diretorio.getChildCount(); j++) {
                    arquivos.add((DefaultMutableTreeNode) diretorio.getChildAt(j));
                }

                //Ordena a lista de arquivos pela representacao de seu tamanho em tamanhoKB, do menor para o maior
                arquivos.sort((a, b) -> {
                    Arquivo arquivoA = (Arquivo) a.getUserObject();
                    Arquivo arquivoB = (Arquivo) b.getUserObject();
                    return Double.compare(arquivoA.getTamanhoKB(), arquivoB.getTamanhoKB());
                });
                //Limpa o diretorio original e remove todos os arquivos filhos do diretorio 
                diretorio.removeAllChildren();
                //Adiciona os arquivos ordenados de volta ao diretório
                for (DefaultMutableTreeNode arquivo : arquivos) {
                    diretorio.add(arquivo);
                }
            }
            //Atualiza visualmente a arvore para mostrar ordenada
            ((DefaultTreeModel) arvore.getModel()).reload();
        });
    }

    public static void main(String[] args) {
    
            // Cria um JFrame com o titulo e define suas propriedades
            JFrame frame = new JFrame("Questão 5 - Ordem Arvore");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            //Exibe o conteudo na tela
            frame.setContentPane(new Questao5());
            frame.setVisible(true);
    }
}
