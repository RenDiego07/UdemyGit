package Generics;
import java.util.ArrayList;
import java.util.List;
public class Grades {
    private ArrayList<Double> calificaciones;
    private Student s1 ;
    public Grades(Student s1){
        calificaciones = new ArrayList<>();
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public Student getS1() {
        return s1;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(double d: this.calificaciones){
            sb.append(d).append("\n");
        }
        return sb.toString();
    }
}
