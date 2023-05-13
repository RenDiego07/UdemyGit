package Remember.Interfaces;
import java.util.*;
public class Comida implements Comestible {
    protected String nombre;
    protected List<String>  ingredientes;
    protected boolean vegan;
    public Comida(){

    }
    public Comida(String nombre, boolean vegan){
        this.ingredientes = new ArrayList<>();
        this.nombre = nombre;
        this.vegan = vegan;
    }
    public void agregarIngredientes(String ing){
        this.ingredientes.add(ing);
    }
    // vamos a hacer sobrecarga
    // vamos a generalizar un metodo por medio de esta sobrecarga
    public void agregarIngredientes(String ... ing){
        for(String i: ing){
                this.ingredientes.add(i);
        }
    }
    public void test1(){

    }
    @Override
    public void comer(){
        System.out.println("hola");
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Comida :" +this.nombre);
        return sb.toString();
    }


}
