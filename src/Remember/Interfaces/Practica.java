package Remember.Interfaces;
import java.util.*;
public class Practica {
    public static void main(String[] args) {
        Comida pizza = new Comida("Pizza",false);
        pizza.agregarIngredientes("pan","queso derretido","peperoni","especies","salsa para pizza");

        // lo que pasa aqui es que ya se sobrescribio el metodo de la interface Comible y por ende todos los metodos de las
        // referencias hacia al objeto tendran el mismo funcionamiento por ejemplo
        Comida tacos = new Comida();



        Insectos ins = new Insectos();
        ins.test20(()->{
            System.out.println("ha funcionado");

        });





    }

}
