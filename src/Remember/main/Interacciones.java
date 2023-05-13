package Remember.main;
import Remember.Colegio.departamento.*;
import Remember.Estudiante;
import Remember.Estudiante.*;
import java.util.*;
public class Interacciones {
    public static void main(String[] args) {
        Colegio espiritu = new Colegio("Espiritu Santo");
        ArrayList<Estudiante> listaEstudiante = new ArrayList<>();
        listaEstudiante.add( new Estudiante("Diego"));
        listaEstudiante.add(new Estudiante("dome"));
        listaEstudiante.add(new Estudiante( "ricardo"));
        espiritu.regEstudiantes = listaEstudiante;
        espiritu.mostrarRegistro();


// importante se tiene que hacer de esta forma para hacer el String.format e
        String nombre = "%s saludos, un placer conocerlos";
        nombre= String.format(nombre,"Diego");
        System.out.println(nombre);
        listaEstudiante.forEach(e-> System.out.println(e)
        );
    }

}
