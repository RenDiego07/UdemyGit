package JavaObjetos;

public class Estudiante {

    public String nombre;
    public int id;
    public static int idTotal = 1;
    public Estudiante(String nombre, int id){
        this.nombre = nombre;
        this.id = idTotal;
    }
    public static String saludar(){
        return "hola soy un estudiante";
    }


}
