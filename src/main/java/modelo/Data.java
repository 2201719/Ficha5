package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.Integer.parseInt;

public class Data {
    private Calendar calendar;

    public Data(int dia,int mes,int ano){
        this.calendar = new GregorianCalendar(ano,mes,dia);
    }

    public static Data parseData(String data){
        //TODO

        //String partes[] = data.split("/");

        var formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);
        try {
            var d = formato.parse(data);
            var calendar= new GregorianCalendar();
            calendar.setTime(d);
            int dia = calendar.get(Calendar.DAY_OF_MONTH);
            int mes = calendar.get(Calendar.MONTH) +1 ;
            int ano = calendar.get(Calendar.YEAR);

            return new Data(ano,mes,dia);
        }catch (ParseException e){
            return null;
        }

    }

    @Override
    public String toString() {
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) +1 ;
        int ano = calendar.get(Calendar.YEAR);
        return dia + "/" + mes + "/" +ano;
    }
}