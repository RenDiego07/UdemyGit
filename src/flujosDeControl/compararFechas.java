package flujosDeControl;

import java.sql.SQLOutput;
import java.util.*;

public class compararFechas {
    public static void main(String[] args) {
         Calendar calendario = Calendar.getInstance();
         calendario.set(2022,10,20);

         Calendar calendario1 = Calendar.getInstance();

         calendario1.set(2022,10,20);

         Date fechaCom = calendario1.getTime();
         Date dateSet = calendario.getTime();
         Date fechaActual =  new Date();
         if ( fechaActual.after(dateSet)){

             System.out.println("Asi es " + fechaActual +" es mas reciente que " + dateSet);
         }
         if (fechaCom.compareTo(dateSet) == 0){

             System.out.println("genial son iguales");
         }
         if((Calendar.DAY_OF_MONTH) == fechaCom.getMonth()){
             System.out.println("ambos tinen el mismo mes");
         }
    }
    // falta saber como comparar las fechas para poder comprar las fechas y de esta forma continuar con el proyecto
}
