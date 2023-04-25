package Arreglos;
import java.util.*;
public class ArregloEjercicio {
    public static void main(String[] args) {
        int [] listaNumeros = new int[6];
            Scanner valor = new Scanner(System.in);

        for(int x  = 0; x < listaNumeros.length; x++){
            System.out.println("Ingrese el valor del indice " + x);
            listaNumeros[x] = Integer.valueOf(valor.nextLine());

        }
        int xtimes = 0;
        int auxiliar = 0;
        int clave;

        ladder:
        for(int x = listaNumeros.length-1; x>= 0; x--){
            if(x == listaNumeros.length-1){
                auxiliar = listaNumeros[0];
                listaNumeros[0] = listaNumeros[x];
            }else{
                if(xtimes <= 6){
                   clave = listaNumeros[xtimes];
                    listaNumeros[xtimes] = auxiliar;
                    auxiliar=clave;

                }
            }
            xtimes++;
        }
        for (int y = 0; y<listaNumeros.length;y++){
            System.out.println("el indice " + y + " es "+listaNumeros[y]);
        }
    }
}
