package Colecciones;
import Generics.Estudiante;

import java.util.*;

public class HashSetEjemplos {
    public static void main(String[] args) {
        HashSet<Estudiante> hs = new HashSet<>();
        hs.add(new Estudiante("Diego"));
        hs.add(new Estudiante("Diego"));
        System.out.println(hs);


    }

}
