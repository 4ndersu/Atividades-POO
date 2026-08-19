package atividade9poo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JProgressBar;
import java.awt.Color;


public class Questao3 {
    
    public Questao3() {
    
    //Cria um JSlider horizontal com valores de 0 a 100
    final JSlider barraSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
    final JProgressBar barraProgresso = new JProgressBar(0, 100); //Barra de progresso
    final JLabel progresso = new JLabel("Valor atual: 0"); //Rotulo para mostrar o valor atual
    final JFrame janela = new JFrame ("Questão 3 - Barra de Progresso"); //Janela
    final JPanel painel = new JPanel();//Painel
    
    //Cor da barra de progresso
    barraProgresso.setBackground(Color.GRAY);
    janela.setSize(300,100);
    //Adiciona componentes
    painel.add(barraSlider);
    painel.add(barraProgresso);
    painel.add(progresso);
    janela.getContentPane().add(painel);

        //Evento para alterar a barra de progresso quando o slider for clicado
        barraSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {//Mudar estado sobrescrito
                int valor = barraSlider.getValue(); //Valor sempre será um inteiro
                progresso.setText("Valor atual: " + valor);//Mostrar valor no JLabel
                //Capturar o valor clicado e adicionar na barra de progresso
                barraProgresso.setValue(valor);
                //Colorir de verde a depender do valor atual clicado no Slider
                barraProgresso.setForeground(Color.GREEN);
            }
        });


    janela.setVisible(true);
    }
    public static void main(String[] args) {
    //Inicializa o programa
    new Questao3();
    }
    }

