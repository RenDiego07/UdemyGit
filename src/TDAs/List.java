package TDAs;
import java.util.Collection;
public interface List<E> {
    public boolean isEmpty();
    public boolean addFirst (E element);
    public boolean addLast (E element);
    public boolean add (E element, int i);
    public E get (int index);
    public int size ();
    public boolean addAll(List<E> lista);
    public void reverse();
    public void trimList(int index1, int index2)throws IndexOutOfBoundsException;
    public boolean remove(int index);
    public boolean remove(E element);
    public int count(E element);
    public int find(E element);
    public boolean isIn(E element);
}
