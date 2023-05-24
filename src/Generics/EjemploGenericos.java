package Generics;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        // para crear metodos genericos se debe de hacer uso de los diamentes
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro listaCarros[] = {c1, c2};
        List<Carro> misCarros = fromArrayToList(listaCarros);
        String nombre = "hola";
        switch (nombre){
            case "hola":
                System.out.println("qye es eso ");
                break;
        }
    }
    private static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    private static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for(G elemento: g){
            System.out.println(g);
        }
        return Arrays.asList(c);
    }
    private static <T> void mostrar(T elemento){
        System.out.println(elemento);
    }

    // limitar la generalizacion
    private static <T extends Number> void imprimir(T elemento){
        System.out.println(elemento);
    }
// aqui se pone esa notacion de diamante solo para poder especificar que se pueden pasar como parametro listas de
    // diferentes objetos
    private static void imprimir (List<? extends Estudiante> estudiantes ){

    }
    private static <T> void imprimir(T el){
        if(el == null){

        }else{
            if(el instanceof Estudiante){
                System.out.println("Ellos van a clase");
            }else if( el instanceof Carro){
                System.out.println("vamos en carro");
            }
        }

    }
    private static <T extends Comparable<T>> T YCompareObjects(T obj1,T obj2,T obj3){
        return obj1;



    }






}
