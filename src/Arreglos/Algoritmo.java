package Arreglos;

public class Algoritmo {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        if((numeros.length) % 2 == 0){
        for(int x=0 ; x<numeros.length/2; x++){
                System.out.println(numeros[x] +" y " + numeros[numeros.length-1-x]);
            }
        }
    }
}
