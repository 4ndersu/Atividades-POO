package atividade9poo;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Questao4 {

    public Questao4() {
    
    //Componentes
    final JPasswordField senha = new JPasswordField(20); //botão
    final JButton botaoSenha = new JButton("Salvar Senha no Arquivo");
    final JFrame janela = new JFrame ("Questão 4 - Salvar Senha"); //janela
    final JPanel painel = new JPanel(); // adiciona componentes
    
    //Editar componentes
    janela.setSize(400,150);
    senha.setSize(200, 100);
    //Adicionar componentes
    painel.add(new JLabel("Digite a senha:"));
    painel.add (senha);
    painel.add(botaoSenha);
    janela.getContentPane().add(painel);
    janela.setLocationRelativeTo(null);
    janela.setVisible(true);

//Evento para abrir o JFileChooser quando o botão de salvar senha for clicado
botaoSenha.addActionListener (new ActionListener() {

    public void actionPerformed (ActionEvent e) {

        //Objeto JFileChooser
        final JFileChooser arquivo = new JFileChooser();//texto
        //Abre a janela para o usuário escolher o local e nome do arquivo
        int resultado = arquivo.showSaveDialog(janela);

        //Verifica se o usuário clicou em Salvar
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = arquivo.getSelectedFile(); //Obtem o arquivo escolhido pelo usuário
            char[] senhaDigitada = senha.getPassword();//Captura o texto escrito no campo de texto senha

            //Bloco que pode causar excecao
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSelecionado))) { //Cria um BufferedWriter para escrever no arquivo selecionado
                escritor.write(senhaDigitada);//Escreve a senha no arquivo
                JOptionPane.showMessageDialog(janela, "Senha salva com sucesso!", "Confirmacao", JOptionPane.INFORMATION_MESSAGE); //Exibe uma mensagem de sucesso
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(janela, "Erro ao salvar a senha: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE); //Em caso de erro ao salvar, mostra uma mensagem de erro
            } finally {
                //Limpa a senha da memória
                java.util.Arrays.fill(senhaDigitada, '0');
            }
        }
    }
});

janela.setVisible(true);

}
public static void main(String[] args) {
//Inicializa a interface
new Questao4();
}
}