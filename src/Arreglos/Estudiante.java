package Arreglos;

public class Estudiante implements Comparable<Estudiante>{
    public String nombre;
    public int edad;
    public Estudiante(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public int compareTo(Estudiante e){
        return ((this.nombre).compareTo(e.nombre));
    }
    @Override
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        cadena.append("Hola soy ").append(nombre).append(" y tengo ").append(edad).append(" Años");
        return cadena.toString();
    }

}
