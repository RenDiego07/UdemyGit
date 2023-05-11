package Matrices;

public class SumarFilasColumnas {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,4,6,5},
                {7,3,9,20},
                {1,0,54,40},
                {30,20,10,5}
        };
        int sumaFila,sumaColumna;
        for(int x = 0; x< matriz.length; x++){
            sumaFila = 0;
            sumaColumna = 0;
            for(int y = 0; y< matriz[x].length; y++){
                sumaFila += matriz[x][y];
                sumaColumna += matriz[y][x];
            }
            System.out.println("Columnas suma : " + sumaColumna);
            System.out.println("filas suma : " + sumaFila);
        }
    }

}
