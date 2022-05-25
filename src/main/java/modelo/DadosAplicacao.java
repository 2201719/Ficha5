package modelo;

import java.util.ArrayList;
import java.util.List;

public class DadosAplicacao {
    private DadosAplicacao INSTANCE = new DadosAplicacao();
    private List<Crianca> criancas;
    private List<Evento> eventos;


    private DadosAplicacao() {
        criancas = new ArrayList<Crianca>();
        eventos = new ArrayList<Evento>();
    }

    public void adicionarCrianca(Crianca crianca){
        //TODO
    }

    public List<Evento> getEventos(Crianca crianca) {
        //TODO
        return eventos;
    }

    public List<Crianca> getCriancas() {
        return criancas;
    }

    public boolean existeCriancaComNome(String nome){
        //TODO
        return false;
    }
}
