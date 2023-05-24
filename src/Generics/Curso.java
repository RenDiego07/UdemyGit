package Generics;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    public List<Student> listaEstudiante;
    public String paralelo ;
    public Curso(String paralelo){
        this.paralelo = paralelo;
        this.listaEstudiante = new ArrayList<>();
    }
}
