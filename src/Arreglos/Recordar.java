package Arreglos;
import java.util.*;
import java.util.Collections;
public class Recordar {
    public static void main(String[] args) {
        ArrayList<Estudiante> le = new ArrayList<>();
        le.add(new Estudiante("Diego",20));
        le.add(new Estudiante("Ricardo",27));
        Collections.sort(le);
        for(Estudiante e: le){
            System.out.println(e);
        }

    }
}
