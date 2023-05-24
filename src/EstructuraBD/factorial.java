package EstructuraBD;

public class factorial {
    public static void main(String[] args) {
        int valor = 1;
        for(int x = 5 ; x >0; x--){
            valor *= x;
        }
        System.out.println("el resultado es " + valor);
    }
}
