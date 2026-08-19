package atividade9poo;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao1 {

    public Questao1() {
    
    //Declara os componenetes
    final JButton botaoInverte = new JButton("Inverter"); //Botão
    final JTextField campoTextoNormal = new JTextField(10); //texto
    final JFrame janela = new JFrame ("Questão 1 - Inverter Texto"); //janela
    final JPanel painel = new JPanel(); //painel
    
    //Define o tamanho da janela
    janela.setSize(400,150);
    //Adiciona os componentes
    painel.add (botaoInverte);
    painel.add (campoTextoNormal);
    janela.getContentPane().add(painel);

//Evento que inverte o campo de texto quando o usuário clicar no botao,
botaoInverte.addActionListener (new ActionListener() {
    
    public void actionPerformed (ActionEvent e) {
        //Pega o texto invertido e o armazena em uma string
        String textoInvertido = new StringBuilder(campoTextoNormal.getText()).reverse().toString();
        final JTextField campoTextoInvertido = new JTextField(10); //texto
        
        //Adiciona a string invertida no Textfield para ser exibido
        campoTextoInvertido.setText(textoInvertido);
        campoTextoInvertido.setEditable(false);

        JDialog caixaTextoInvertido = new JDialog(janela);

        //Define as dimensões do JDialog que abrirá quando o usuario clincar no botão de inverter
        caixaTextoInvertido.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        caixaTextoInvertido.setBounds(350,250,300,150);
        caixaTextoInvertido.setTitle("Texto invertido");
        caixaTextoInvertido.add(campoTextoInvertido);
        caixaTextoInvertido.setModal(true);
        caixaTextoInvertido.setResizable(false);
        caixaTextoInvertido.setVisible(true);
    }
});

janela.setVisible(true);

}
public static void main(String[] args) {
//Inicializa o programa
new Questao1();
}
}