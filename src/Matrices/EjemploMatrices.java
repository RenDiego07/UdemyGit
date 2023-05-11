package Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        int [][] matriz = new int[2][4];
        matriz[0][3]  = 4;
        matriz[0][1] = 2;
        matriz[1][0] = 1;
        matriz[1][2] = 3;
        for(int x = 0; x<matriz.length; x++){
            for(int j = 0; j< matriz[x].length; j++){
                System.out.println("Fila " + x + "Columna " +j + " "+matriz[x][j]);
            }
        }
    }
}
