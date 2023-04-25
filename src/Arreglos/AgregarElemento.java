package Arreglos;
import java.util.*;
public class AgregarElemento {
    public static void main(String[] args) {
        int[] listaNumeros = {1, 2, 3, 4, 0};
        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese que posicion del 0 al 5");
        int digito = 0;
        int userNum = 0;
        try {
            userNum = Integer.valueOf(valor.nextInt());
            System.out.println("ingrese un numero");
            digito = Integer.valueOf(valor.nextInt());
            if ((userNum < 0 || userNum >= 5)) {
                throw new DiegoException("numero incorrecto");
            }else{

                int auxiliar = listaNumeros[userNum];
                listaNumeros[userNum] = digito;
                if(userNum< listaNumeros.length){
                    for(int x =userNum ;x<listaNumeros.length;x++){
                        int aux1 = listaNumeros[x+1];
                        listaNumeros[x+1] = auxiliar;
                        auxiliar = aux1;

                    }
                }

                for(int y = 0; y< listaNumeros.length;y++){
                    System.out.println(listaNumeros[y]);
                }


            }

        } catch (DiegoException ew) {
            System.out.println(ew.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(userNum);
            e.printStackTrace();
        }


    }
}
