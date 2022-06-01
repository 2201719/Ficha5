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
    private JPanel painelAdicionarCrianca;

    private Crianca crianca;


    public DetalhesCrianca(Frame parent,boolean modal){
        btnAceitar.addActionListener(this::btnAceitarActionPerformed);
        setContentPane(painelAdicionarCrianca);
        pack();
        setVisible(true);
    }

    public static Crianca mostrarCriacaoCrianca(Frame parent){
        var detalhes = new DetalhesCrianca(parent,true);
        return detalhes.getCrianca();
    }

    private Crianca getCrianca() {
        return crianca;
    }


    private void initComponents(){
        //TODO
    }

    private void btnCancelarActionPerformed(ActionEvent evt){
        //TODO

    }

    private void btnAceitarActionPerformed(ActionEvent evt){
        //TODO
        String nomeCrianca = txtNome.getText();
        String dataCrianca =txtDataNascimento.getText();
        String localNascimento = txtLocalNascimento.getText();


        if (!isNomeValido(nomeCrianca)){
            Erros.mostrarErro(this,Erros.NOME_INVALIDO);
        }
        if (!isDataValida(dataCrianca)){
            Erros.mostrarErro(this,Erros.DATA_INVALIDA);
        }
        if (!isLocalNascimentoValido(localNascimento)){
            Erros.mostrarErro(this,Erros.LOCAL_NASCIMENTO_INVALIDO);
        }

        if (existeCriancaComNome(nomeCrianca)){
            Erros.mostrarErro(this,Erros.CRIANCA_EXISTE);
        }


    }

    private void fechar(){
        //TODO
    }

    private boolean isNomeValido(String nome){
        if (nome.trim().length() >= 2)
            return true;
        return false;
    }

    private boolean isLocalNascimentoValido(String local){
        if (local.trim().length()<2)
            return true;

        return false;
    }

    private  boolean isDataValida(String data){
//TODO

        return true;
    }

    private boolean existeCriancaComNome(String nome){
        //TODO
        return true;
    }
}
