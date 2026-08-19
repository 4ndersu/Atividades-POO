package atividade9poo;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao2 {

    public Questao2() {

    //Define os componentes da interface
    final JRadioButton maiuscula = new JRadioButton("Maiúsculas");
    final JRadioButton minuscula = new JRadioButton("Minúsculas");
    final ButtonGroup grupo = new ButtonGroup();//Grupo de botões
    final JTextField campoTexto = new JTextField(10);//Campo de texto normal
    final JTextField campoTextoConvertido = new JTextField(10);//Campo de texto que sera convertido
    final JFrame janela = new JFrame ("Questão 2 - Maiusculas e minúsculas"); //janela
    JPanel painel = new JPanel(); //Painel
    
    //Define o grupo de botôes com JRadioButton
    grupo.add(maiuscula);
    grupo.add(minuscula);
    
    //Dimensões da janela
    janela.setSize(300,100);
    
    //Adiciona os componentes
    painel.add(maiuscula);
    painel.add(minuscula);
    painel.add(campoTexto);
    painel.add (campoTextoConvertido);
    janela.getContentPane().add(painel);

//Evento para deixar as letras maiusculas quando o usuario clicar no botão
maiuscula.addActionListener (new ActionListener() {

    public void actionPerformed (ActionEvent e) {
        //String que captura a palavras digitada no JTextfield e deixa seus caracteres maiusculos
        String textoMaiusculo = campoTexto.getText().toUpperCase().toString();
        //Adiciona o trecho convertido da String no campo de texto
        campoTextoConvertido.setText(textoMaiusculo);
        campoTextoConvertido.setEditable(false);
    }
});
//Evento para deixar as letras minusculas quando o usuario clicar no botão
minuscula.addActionListener (new ActionListener() {

    public void actionPerformed (ActionEvent e) {
        //String que captura a palavras digitada no JTextfield e deixa seus caracteres minusculos
        String textoMinusculo = campoTexto.getText().toLowerCase().toString();
        //Adiciona o trecho convertido da String no campo de texto
        campoTextoConvertido.setText(textoMinusculo);
        campoTextoConvertido.setEditable(false);
    }
});

janela.setVisible(true);
}
public static void main(String[] args) {
//Inicializa a interface
new Questao2();
}
}