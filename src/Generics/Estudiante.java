package Generics;

import java.util.*;

public class Estudiante implements Comparable<Estudiante>,Identificable<String> {

    public String nombre;
    public int cedula;
    public int edad;

    public Estudiante(String nombre, int cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;

    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre);
        return sb.toString();
    }



    @Override
    public boolean equals(Object e) {

        if (e == this) {
            return true;
        } else if (e != null && e instanceof Estudiante) {
            Estudiante other = (Estudiante) e;
            if (other.nombre.equals(this.nombre)) {
                return true;
            }
        }
        return false;
    }
    public int compareTo(Estudiante r){
        int valor = (String.valueOf(this.nombre)).compareTo((String.valueOf(r.edad)));
        return valor;
    }
    // creando un metodo que nos permite dar un subconjunto de la lista
    public List<Estudiante> subLista (ArrayList<Estudiante> lista, int a, int b){
        return lista.subList(a,b);
    }
    @Override
    public String retornarIdentificacion(){
        return this.nombre;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.nombre);
    }



    public static void main(String[] args) {
        Estudiante diego = new Estudiante("DiegoFlores",9,2);
        Estudiante Diego = new Estudiante("Diego",0,0);
        if(diego.equals(Diego)){
            System.out.println("sep");
        }
        List<Estudiante> registro= Arrays.asList(diego,Diego);
        Collections.sort(registro);
        for(Estudiante e: registro){
            System.out.println(e);
        }



    }

}
