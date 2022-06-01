package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.Integer.parseInt;

public class Data {
    private Calendar calendar;

    public Data(int dia,int mes,int ano){
        this.calendar = new GregorianCalendar(ano, mes - 1 , dia);
    }

    public static Data parseData(String data){
        //TODO

        return new Data(ano,mes,dia);
    }
}
