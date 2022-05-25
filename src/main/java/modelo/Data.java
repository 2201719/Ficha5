package modelo;

import java.util.Calendar;

public class Data {
    private Calendar calendar;

    public Data(int dia,int mes,int ano){
        this.calendar.set(ano,mes,dia);
    }

    public static Data parseData(String data){
        //TODO
        return new Data(1,1,1);
    }
}
