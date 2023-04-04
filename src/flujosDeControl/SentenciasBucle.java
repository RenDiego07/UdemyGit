package flujosDeControl;

public class SentenciasBucle {

    public static void main (String [] args){
        String frase =  "tres tristes tigres tragaban trigo en un trigal";
        String palabra = "tres";
        int veces= 0;
        // vamos a ver cuantas veces
        Iterando_frase:
        for(int x =0 ; x< frase.length(); x++){
            int help = x;
            for(int y = 0 ; y< palabra.length(); y++){
                if(frase.charAt(help++)!= palabra.charAt(y)){ // frase.charAt(help++)--> lo que hace es buscar con el valor de help sin aumentar y luego lo aumenta
                    continue Iterando_frase;
                }

            }
            veces++;
        }
        System.out.println(veces);
    }

}
