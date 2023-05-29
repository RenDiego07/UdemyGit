package TDAs;

import Generics.Student;

import java.util.Collection;

public class ArrayList<E> implements List<E> {

    private E[] elements;
    private int MAX_SIZE = 100;
    private int effectiveSize;


    /*public ArrayList() {
        // elements = new E[100]; // NO vale
        elements = (E[]) new Object[MAX_SIZE];
        effectiveSize = 0;
    }

    @Override
    public boolean isEmpty() {
        return effectiveSize == 0;
    }

    @Override
    public boolean addFirst(E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addLast(E element) {
        if (element == null) {
            return false;
        }
        if (isFull()) {
            addCapacity();
        }
        
        //con humildad
        //elements[effectiveSize] = element;
        //effectiveSize++;
        
        // con orgullo
        elements[effectiveSize++] = element;
        return true;
    }
    
    private boolean isFull () {
        return effectiveSize == MAX_SIZE;
    }

    @Override
    public boolean add(E element, int index) {
        if (index < 0 || index > effectiveSize) {
            // throw new IndexOutOfBoundsException("Invalid index: " + index);
            return false;
        }
        if (isFull()) {
            addCapacity();
        }
        for (int i=effectiveSize; i > index; i--) {
            elements[i] = elements[i-1];
            // elements[i+1] = elements[i]; MAL
        }
        elements[index] = element;
        effectiveSize++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= effectiveSize) {
            return null;
        }
        return elements[index];
    }
    @Override
    public int size() {
        return effectiveSize;
    }

    private void addCapacity() {
        MAX_SIZE = MAX_SIZE*2;
        E[] newElements = (E[]) new Object[MAX_SIZE];
        // copiando los elementos del arreglo viejo al nuevo
//        for (int i= 0; i<effectiveSize; i++) {
        for (int i= 0; i<elements.length; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }*/
    public ArrayList(){
        this.elements = (E[]) new Object[MAX_SIZE];
        effectiveSize = 0;

    }

    @Override
    public boolean isEmpty() {
        return effectiveSize == 0;
    }

    @Override
    public boolean addFirst(E element) {
        if(element == null){
            return false;
        }
        else{
            if(isFull()){
                extendArray();
            }
            E aux1 = elements[0];
            elements[0] = element;
            for(int x = 0 ; x<effectiveSize; x++){
                E aux2 = elements[x+1];
                elements[x+1] = aux1;
                aux1 = aux2;
            }
            effectiveSize++;

        }
        return true;
    }


    @Override
    public boolean addLast(E element) {
       if(element == null){
           return false;

       }else{
           if(isFull()){
               extendArray();
           }else if(isEmpty()){
               elements[0] = element;
           }
           elements[effectiveSize++] = element; ;
           return true;
       }
    }

    @Override
    public boolean add(E element, int i) {
        // ingresa el elemento considerando que la lista empieza desde 0
        if(element == null&& i>=effectiveSize){
            return false;
        }
        else {
            if(isFull()){
                extendArray();
            }
            E aux = elements[i];
            elements[i] = element;
            for(int x = i ; x< effectiveSize+1; x++){
                E aux2 = elements[x+1];
                elements[x+1] = aux;
                aux = aux2;
            }
        }
        effectiveSize++;
        return true;
    }

    @Override
    public E get(int index) {
        if(index < 0 && index>=effectiveSize){
            return null;
        }
        return elements[index];
    }

    @Override
    public int size() {

        return effectiveSize;
    }
    public boolean isFull(){
        return effectiveSize == MAX_SIZE;
    }
    public void extendArray(){
        if(isFull()){
            MAX_SIZE = MAX_SIZE*2;
            E [] elementsReplace = (E[]) new Object[MAX_SIZE];
            for(int x = 0; x<effectiveSize; x++){
                elementsReplace[x] = elements[x];
            }
            elements = elementsReplace;
        }
    }
    @Override
    public boolean addAll(List<E> lista) {
        ArrayList<E> ob = (ArrayList<E>) lista;
        if(ob != null){
            return false;
        }
        if(ob.isEmpty()){
            return true;
        }else{
            int othersEfectiveness = ob.effectiveSize;

            if(effectiveSize+ othersEfectiveness >= MAX_SIZE){
                extendArray();
            }
            int contador = 0;
            for(int x = effectiveSize ; x<effectiveSize+ othersEfectiveness; x++){
                elements[x] = ob.elements[contador++];
            }
            return true;
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x< effectiveSize; x++){
            sb.append(elements[x]+"\n");

        }
        return sb.toString();
    }
    @Override
    public void reverse(){
        E [] auxArray = (E []) new Object[MAX_SIZE];
        int index = 0;
        for(int x = size() -1; x>= 0; x--){
            System.out.println(x);
            auxArray[index] = elements[x];
            index++;
        }
        elements = auxArray;
    }
    //throws indexOutBoundsException no es obligatorio porque no es Checked
    @Override
    public void trimList(int index1, int index2)throws IndexOutOfBoundsException{

        if(index1 < 0 || index2< 0){
            throw new IndexOutOfBoundsException();
        }else{
            if(size() == 0){
                throw new IndexOutOfBoundsException();
            }
            else if(index1<size()-1 && index2 < size() -1){
                E [] auxList = (E[]) new Object[index1+index2];
                int aux = 0;
                int newEfectiveSize = index2-index1+1;
                for(int x = index1 ; x<= index2; x++){

                    auxList[aux++] = elements[x];
                }
                elements = auxList;
                effectiveSize = newEfectiveSize;
            }
        }
    }
    @Override
    public boolean remove(int index){
        if(index > size()-1 || isEmpty()){
            return false;
        }
        else{
            if(effectiveSize == 1){
                elements[0] = null;
            }
            if(index == size()-1){
                elements[index] = null;

            }else{
                E aux;
                E aux2 = elements[size()-1];
                for(int x = size()-1; x>index; x--){
                    aux = elements[x-1];
                    elements[x-1] = aux2;
                    aux2 = aux;
                }
            }
            effectiveSize--;
            return true;
        }
    }
    @Override
    public boolean remove(E element){
        if(isIn(element)){
            remove(find(element));
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int count(E element) {
        int retornar = 0;
        for(int x = 0; x<size(); x++){
            if(elements[x].equals(element))
                 retornar++;
        }
        return 0;
    }
    @Override
    public int find(E element) {
        int retornar = -1;
        if(element == null || size() ==0){
            return -1;
        }else{
            for(int x = 0; x < size(); x++){
                if(elements[x].equals(element)){
                    retornar = 1;
                }
            }
            return retornar;
        }
    }
    @Override
    public boolean isIn(E element){
        if(find(element) == 1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Student c1 = new Student("Diego","20");
        Student c2 = new Student("Sandy","30");
        ArrayList<Student> listStudents1 = new ArrayList<>();
        listStudents1.addFirst(c1);
        listStudents1.addLast(c2);
        listStudents1.add(new Student("Ricardo","40"),1);
        listStudents1.add(new Student("Scarlet","50"),0);
        listStudents1.addLast(new Student("pau","60"));
        listStudents1.addFirst(new Student("alex","70"));
        System.out.println(listStudents1);
        System.out.println("\n");
        listStudents1.reverse();
        System.out.println(listStudents1);
        listStudents1.trimList(1,3);
        System.out.println(listStudents1);
        listStudents1.remove(1);
        System.out.println(listStudents1);
    }
}
