package flujosDeControl;
import java.text.SimpleDateFormat;
import java.util.Date;
public class javaDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);
        System.out.println(fecha.getClass());
        SimpleDateFormat txt = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String date = txt.format(fecha);
        System.out.println(date);
        // simpledateformat java14 search google

        // modify date's design

    }
}
