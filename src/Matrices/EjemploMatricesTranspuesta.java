package Matrices;

public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,4,6,5},
                {7,3,9,20},
                {1,0,54,40},
                {30,20,10,5}
        };

        for(int x = 0; x<matriz.length; x++){
            for(int y= 0; y< x; y++){
                int auxiliar = matriz[x][y];
                matriz[x][y] = matriz[y][x];
                matriz[y][x] = auxiliar;

            }
        }
        for(int x = 0; x< matriz.length; x++){
            for(int y = 0 ; y< matriz[x].length; y++){
                System.out.print(matriz[x][y] + "\t");
            }
            System.out.println();
        }
    }

}
