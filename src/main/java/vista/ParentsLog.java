package vista;

import modelo.Crianca;
import modelo.Evento;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ParentsLog extends JFrame{
    private JButton btnAdicionarCrianca;
    private JButton btnNovoEvento;
    private JComboBox<Crianca> cbCriancas;
    private JList<Evento> lstEventos;
    private JPanel painelPrincipal;

    public ParentsLog(){
        //TODO
        btnAdicionarCrianca.addActionListener(this::btnAdicionarCriancaActionPerformed);
        setContentPane(painelPrincipal);
        pack();
        setVisible(true);
    }

    private void atualizarCriancas(){
        //TODO
    }
    private void atualizarEventos(){
        //TODO
    }

    private void initComponents(){
        //TODO
    }

    private void btnAdicionarCriancaActionPerformed(ActionEvent evt){
        //TODO
        System.out.println("Click no btnAdicionarCrianca");
        var crianca = DetalhesCrianca.mostrarCriacaoCrianca(this);

    }

    public static void main(String[] args) {
        //TODO
        new ParentsLog();
    }

}
