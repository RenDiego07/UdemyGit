package Generics;
import java.util.*;
public class Box <T> {

    public T label;

    public Box(T label){
        this.label = label;
    }
    public T getLabel(){
        return this.label;
    }

    public static void main(String[] args) {
        Box<Carro> b1 = new Box<>(new Carro());
        Carro c1 = b1.getLabel();


    }
}
