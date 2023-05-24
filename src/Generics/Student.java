package Generics;

public class Student {
    private String nombre;
    private String cedula;
    public Student(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    @Override
    public String toString(){
        return this.nombre + " numero cedula: " + cedula;
    }
}
