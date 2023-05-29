package recursividad;
import java.util.Arrays;
import java.util.Scanner;
public class Algorithms {

    public static int auxiliar = 0;
    public static int contador = 0;
    public static void main(String[] args) {
        int [] serie = {1,2,3,4,5,};

        System.out.println(sumArray(serie));
        System.out.println(CalcPotencia(2,3));
        System.out.println(sumaDigitos(12345));
        System.out.println(contarRegresivamente(5));

    }
    public static void algorithm(int [] arreglo){
        if(arreglo.length >0){
            if(contador < arreglo.length){
                auxiliar += arreglo[contador];
                contador++;
                algorithm(arreglo);
            }
        }

    }
    public static int sumArray(int [] arreglo){

        if(arreglo.length == 1){
            return  arreglo[0];
        }else{
            int auxiliar2 = arreglo[arreglo.length-1];
            arreglo = Arrays.copyOf(arreglo,arreglo.length-1);
            return auxiliar2 + sumArray(arreglo);

        }


    }
    public static int CalcPotencia(int base, int exponente){
        if(exponente ==0){
            return 1;
        }else{
            exponente--;
            return base*CalcPotencia(base, exponente);
        }
    }

    // otra manera de hacerlo
    public static int test(int numero){
        if(numero == 0){
            return 1;
        }else{
            int auxiliar = numero;
            numero = numero-1;
            return auxiliar + test(numero);
        }
    }

    public static int sumaDigitos(int realPositivo){
        String cadena = String.valueOf(realPositivo);
        if(cadena.length() == 1){
            return realPositivo;
        }else{
            char numStr = cadena.charAt(cadena.length()-1);
            int num = Character.getNumericValue(numStr);
            cadena = cadena.substring(0,cadena.length()-1);
            realPositivo = Integer.valueOf(cadena);
            return num + sumaDigitos(realPositivo);
        }
    }
    public static String contarRegresivamente(int numero){

        if(numero == 0){
            return ""+numero;
        }else{
            int auxiliar3 = numero;
            numero--;
            return auxiliar3 +"\n" + contarRegresivamente(numero);
        }

    }
}
