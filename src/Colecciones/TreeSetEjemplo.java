package Colecciones;
import java.util.*;
public class TreeSetEjemplo {
    public static void main(String[] args) {
        // se arregla de forma natural alfabetica
        // dentro del constructor se pueden hacer uso de clase anonimas o uso de funciones lambdas
        // pòdemos poner dentro Comparator.reverseOrder()

        Set<String> arreglo = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        arreglo.add("a");
        arreglo.add("c");
        arreglo.add("b");
        System.out.println(arreglo);

        Comible x = new Comible(){
            @Override
            public void comer(){
                System.out.println("se hace asi");}
        };

    }
}
