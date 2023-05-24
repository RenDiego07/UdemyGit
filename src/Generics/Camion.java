package Generics;
import java.util.*;
// la interface Iterable hace que al momento de hacer un for each el elemento de la clase va a ser el tipo generico
// Object
// el dioamente indica que tiene un parametro generico
public class Camion<T> implements Iterable<T>, Identificable<Integer>{
    private List<T> objetos;
    public int Dni;
    private int max;

    public Camion(int max){
        this.max = max;
        this.objetos = new ArrayList<>();

    }
    public void add(T objeto) {
        if(this.objetos.size()< max){
            this.objetos.add(objeto);
        }else{
            throw new RuntimeException("eiweiou");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }

    @Override
    public Integer retornarIdentificacion() {
        return this.Dni;
    }
}
