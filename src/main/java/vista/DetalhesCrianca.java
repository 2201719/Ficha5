package vista;

import modelo.Crianca;
import modelo.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DetalhesCrianca extends JDialog{
    private JButton btnAceitar;
    private JButton btnCancelar;
    private JTextField txtDataNascimento;
    private JTextField txtLocalNascimento;
    private JTextField txtNome;

    private Crianca crianca;


    public DetalhesCrianca(Frame parent,boolean modal){
        //TODO
    }

    public static Crianca mostrarCriacaoCrianca(Frame parent){
        //TODO
        return new Crianca("",new Data(1,1,1),"");
    }

    private void initComponents(){
        //TODO
    }

    private void btnCancelarActionPerformed(ActionEvent evt){
        //TODO
    }

    private void btnAceitarActionPerformed(ActionEvent evt){
        //TODO
    }

    private void fechar(){
        //TODO
    }

    private boolean isNomeValido(String nome){
        //TODO
        return false;
    }

    private boolean isLocalNascimentoValido(String local){
        //TODO
        return false;
    }

    private  boolean isDataValida(String data){
        //TODO
        return false;
    }

    private boolean existeCriancaComNome(String nome){
        //TODO
        return false;
    }
}
