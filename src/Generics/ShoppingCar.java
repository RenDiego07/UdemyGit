package Generics;
import java.util.*;
public class ShoppingCar<T> implements Iterable<T>{
  private String nombre;
  public List<T> listaCompras;
  public ShoppingCar(String nombre){
      this.nombre = nombre;
      this.listaCompras = new ArrayList<>();
  }
  @Override
  public Iterator<T> iterator(){
      return this.listaCompras.iterator();
  }
  public void add(T objeto){
      this.listaCompras.add(objeto);

  }
}
