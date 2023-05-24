package EstructuraBD;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SucesionFibonacci {
    public static int x ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Ingrese el indice de la sucesion de fibonacci que desee:");
            x = sc.nextInt();
            // tiene que ser con un metodo recursivo
            ArrayList<Integer> sucesion = new ArrayList<>();
            sucesion.add(0);
            sucesion.add(1);
            System.out.println(sucesion.get(0));
            System.out.println(sucesion.get(1));

            System.out.println(Fibonacci(sucesion));
            System.out.println(sucesion);
        }catch(NumberFormatException e){
             e.printStackTrace();
        }
    }
    public static int Fibonacci(ArrayList<Integer> sucesion){

        if(sucesion != null){
            int longitud = sucesion.size();
            if(sucesion.size() != x){
                sucesion.add(sucesion.get(longitud-1)+sucesion.get(longitud-2));
                Fibonacci(sucesion);

            }else if(sucesion.size() == x){
                return sucesion.get(x-1);
            }

        }
        return sucesion.get(x-1);
    }
}
