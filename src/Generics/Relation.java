package Generics;
import java.util.Arrays;
import java.util.List;
public class Relation<T, G> {
    private T entidad1;
    private G entidad2;

    public Relation(T entidad1 , G entidad2){
        this.entidad1 = entidad1;
        this.entidad2 = entidad2;

    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("el estudiante ").append( entidad1).append("\n").append("Calificaciones : ").append(this.entidad2) ;
        return sb.toString();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Diego","09392039");
        Grades grades = new Grades(s1);

        grades.getCalificaciones().add(203.2);
        grades.getCalificaciones().add(201.0);
        Relation<Student, Grades> completo = new Relation<>(s1,grades);
        System.out.println(completo);

    }

}
