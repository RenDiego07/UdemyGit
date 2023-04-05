package flujosDeControl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class calcularEdad {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Scanner valor = new Scanner(System.in);


        try{
            System.out.println("Ingrese su fecha de nacimiento yyyy-MM-dd");
            Date date = dateFormat.parse(valor.nextLine());

            Date todaysDate = new Date();
            System.out.println("El usuario tiene " + ((todaysDate.getYear()+1900)-(date.getYear()+1900))+" Años");
        }catch(ParseException e){
            System.out.println("no se cumplio con el formato de la fecha ");
        }
    }
}
//System.out.println(date.getYear()+1900); para que me de el valor del año tengo que sumar 1900