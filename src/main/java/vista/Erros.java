package vista;

import javax.swing.*;
import java.awt.*;

public class Erros {
    public static final int NOME_INVALIDO = 1;
    public static final int DATA_INVALIDA = 2;
    public static final int LOCAL_NASCIMENTO_INVALIDO = 3;
    public static final int CRIANCA_EXISTE = 4;



    public static void mostrarErro(Window parent, int numero){
        switch (numero){
            case NOME_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Nome inválido");
                break;
            case DATA_INVALIDA:
                JOptionPane.showMessageDialog(parent,"Data inválido");

            case LOCAL_NASCIMENTO_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Local de nascimento inválido");

            case CRIANCA_EXISTE:
                JOptionPane.showMessageDialog(parent,"Criança já existe");
            default:

        }
    }
}
