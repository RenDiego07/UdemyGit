package Matrices;

public class MatrizSimetrica {
    public static void main(String[] args) {
        boolean simetrica = true;

        int [][] simetricaMatriz = {
                {1,2,3,4},
                {2,9,4,6},
                {3,4,3,1},
                {4,6,1,9}
        } ;
        int x, y;
        x = 0;
        primary:
        while( x<simetricaMatriz.length && simetrica){
            y=0;
// la condicion y< x es una forma para evitar iterar la diagonal principal
            // estaba y< simetricaMatriz[x].length;
            while(y<x && simetrica){
                if(simetricaMatriz[x][y]!= simetricaMatriz[y][x]){
                    simetrica= false;
                    break primary;
                }
                y++;
            }
            x++;
        }
        System.out.println("la matriz es simetrica? : " + simetrica );
    }
}
