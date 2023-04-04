package flujosDeControl;
import java.util.*;
public class javaCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        // se puede ingresar cualquier fecha año, mes, dia, hora, min, segundos y milisegundos xd
        calendario.set(2020,0,25);

        Date fecha = calendario.getTime();

        System.out.println(fecha);

    }
}
