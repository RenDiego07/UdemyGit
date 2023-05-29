package Generics;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<>();
        cadena.add("hola");
        ArrayList<String> cadena1 = new ArrayList<>();
        cadena.addAll(cadena1);
        System.out.println(cadena);
    }
}
