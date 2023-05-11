package Matrices;

public class CreandoMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y< matriz[x].length; y++){
                if( y!= x){
                    matriz[x][y] = 0;
                }else{
                    matriz[x][y] = 1;
                }
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
