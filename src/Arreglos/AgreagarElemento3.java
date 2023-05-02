package Arreglos;
import java.util.*;
public class AgreagarElemento3 {
    public static void main(String[] args) {
        int [] escaleras = {1,2,3,4,5,6};
        Scanner valor = new Scanner(System.in);

        int userNum,userIndex,auxiliar,end;

        try{
            System.out.println("Ingrese el indice {0-5}");
            userIndex = valor.nextInt();
            System.out.println("Ingrese un numero");
            userNum = valor.nextInt();


            if(userIndex< escaleras.length){
                auxiliar = escaleras[userIndex];
                escaleras[userIndex] = userNum;
                for(int x = userIndex; x<escaleras.length-1;x++){
                    int aux1 = escaleras[x+1];
                    escaleras[x+1]= auxiliar;
                    auxiliar = aux1;

                }
                int [] escaleras2 = new int[escaleras.length+1];

                System.arraycopy(escaleras,0,escaleras2,0,escaleras.length);
                escaleras2[escaleras.length] = auxiliar;
                for(int x = 0; x<escaleras2.length;x++){
                    System.out.println(escaleras2[x]);
                }
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
