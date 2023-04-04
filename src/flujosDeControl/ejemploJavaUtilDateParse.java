package flujosDeControl;
import java.util.*;
import java.text.*;
import java.util.Scanner;
public class ejemploJavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha = formato.parse("2020-01-05");
            System.out.println(formato.format(fecha));
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        Scanner pedido = new Scanner(System.in);
        StringBuilder cadenas = new StringBuilder();
        SimpleDateFormat txt = new SimpleDateFormat("yyyy-MM-dd");
        for(int x = 0 ; x<5; x++){
            try{
                System.out.println("Ingrese el tipo de fecha con el formato 'yyyy-MM-dd'");
                String d = pedido.nextLine();
                 Date f = txt.parse(d);
                 cadenas.append(txt.format(f)+"\n");
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        System.out.println(cadenas.toString());
    }
}
