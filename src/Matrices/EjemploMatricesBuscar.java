package Matrices;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int [][] matricesDeEnteros = {
                {2,4,5,6},
                {2,5,6,9},
                {0,25,30,40}
        };
        int elemento = 30;
        boolean vbool = false;

        int x;
        int y=0;
        buscandoFilas:
        for(x = 0; x<matricesDeEnteros.length; x++){
            buscandoColumnas:
            for(y = 0; y< matricesDeEnteros[x].length; y++){
                if(matricesDeEnteros[x][y] == elemento){
                    vbool = true;
                    break buscandoFilas;
                }
            }
        }
        System.out.println(vbool);
        System.out.println("Se encontro en las coordenadas " + x + " : " + y );
    }


}
