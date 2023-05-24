package Generics;
import java.util.*;
public class mainGenerico {
    public static void main(String[] args) {

        ShoppingCar<Estudiante> listaEstudiante = new ShoppingCar<>("Los coyotes");
        listaEstudiante.add(new Estudiante("DIego"));
        listaEstudiante.add(new Estudiante("Diego"));
        for(Estudiante e: listaEstudiante){
            System.out.println(e);
        }
        ShoppingCar<Carro> listaCarros = new ShoppingCar<>("Empresa Toyota");



    }
    public static <T> void imprimirShopping(Camion<T> camion){
        for(T objetos: camion){
            // valido
        }
    }
}
