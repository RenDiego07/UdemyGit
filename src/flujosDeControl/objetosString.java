package flujosDeControl;

public class objetosString {
    public static void main(String [] args) {
            Integer [] caja= {1,2,3,4,5};
            int lenghtIterando = caja.length;

            Buscando_Numeros: for(int x =0 ; x< lenghtIterando; x++){
                if(caja[x] <4)
                    continue Buscando_Numeros;
                System.out.println("si funciono");
            }
            
    }



}