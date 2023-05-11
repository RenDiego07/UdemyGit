package Matrices;

public class EjemploMatricesVariable {
    public static void main(String[] args) {

        int [][] matriz = new int[2][];
        matriz [0] = new int[3];
        matriz[1] = new int[4];
        for(int x = 0; x< matriz.length; x++){
            System.out.println();
            for(int j = 0; j<matriz[x].length; j++){
                System.out.print(matriz[x][j]+ "\t");
            }
        }
        System.out.println();
        String frase = "hola amigos";
        for(int x = 0 ; x<frase.length(); x++){
            System.out.print(frase.charAt(x)+"\t");
        }

    }
}
