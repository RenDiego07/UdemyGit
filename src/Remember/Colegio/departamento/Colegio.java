package Remember.Colegio.departamento;
import java.util.*;
import Remember.Estudiante;
public class Colegio {
    public List<Estudiante> regEstudiantes;
    public String nombre;
    public int cantidadEstudiantes;

// lo que sucede es que se llama al constructor de la clase
    public Colegio(String nombre){
        this.nombre= nombre;
        regEstudiantes = new ArrayList<>();
    }
    // se llama al constructor que recibe como parametro un string y hace la funcion que hace el constructor
    public Colegio(){
        this("Diego");

    }
    public Colegio(String nombre, List<Estudiante> regEstudiantes){
        this.regEstudiantes = regEstudiantes;
    }




    public void mostrarRegistro(){
        for(Estudiante e: this.regEstudiantes){
            System.out.println(e);
        }
    }

}
