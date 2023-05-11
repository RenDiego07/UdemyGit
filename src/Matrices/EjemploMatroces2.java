package Matrices;

public class EjemploMatroces2 {
    public static void main(String[] args) {
        String [][] matrix  = new String[2][4];
        matrix[0][0] = "juan";
        matrix [0][1]= "jaime";
        matrix [1][0] = "edu";
        matrix [1][1] = "diego";
        for(String [] arreglo : matrix){
            for(String palabras: arreglo){
                System.out.println(palabras);
            }
        }
    }
}
