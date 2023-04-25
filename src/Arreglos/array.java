package Arreglos;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array {
    public static void main(String[] args) {
        String [] palabras = new String [5];
        palabras[0] = "feliz";
        palabras[1] = "triste";

        for (int x = palabras.length-1;x>=0; x--){
            System.out.println(palabras[x]);
        }

        //  por medio de la clase Arrays podemos ordenar cosas
        System.out.println("---------------------------------------------\n");
        // otra forma de cambiar el orden del objeto array
        Collections.reverse(Arrays.asList(palabras));
        for (int x = 0  ; x< palabras.length; x++){
            System.out.println(palabras[x]);
        }
    }
}
