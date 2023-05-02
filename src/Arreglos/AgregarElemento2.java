package Arreglos;
import java.util.*;
public class AgregarElemento2 {
    public static void main(String[] args) {

        int [] listaNumeros = {1,2,3,4,5,0};
        for(int y = 0; y<listaNumeros.length; y++){
            System.out.println(listaNumeros[y]);
        }
        Scanner valor  = new Scanner(System.in);
        try{
            System.out.println("Ingrese el indice {0-5}");
            int userIndex = valor.nextInt();
            System.out.println("Ingrese un numero");
            int userNum = valor.nextInt();
            int auxiliar = listaNumeros[userIndex];
            listaNumeros[userIndex] = userNum;
            if(userIndex < listaNumeros.length){
                for(int x =userIndex; x<listaNumeros.length; x++){
                    int replace = listaNumeros[x+1];
                    listaNumeros[x+1] =auxiliar;
                    auxiliar = replace;
                }
            }

        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(Exception e2){
            e2.printStackTrace();
        }
        for(int z = 0; z<listaNumeros.length; z++){
            System.out.println(listaNumeros[z]);
        }
    }

}
