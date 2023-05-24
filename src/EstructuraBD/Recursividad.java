package EstructuraBD;

public class Recursividad {
    public static int contador = 0;
    public static int sum = 0;
    public static void main(String[] args) {
        sumas();
        System.out.println(sum);

    }
    public static int sumas(){
        contador++;
        if(contador<5){
            sum+=5;
            sumas();

        }
        return sum;
    }
}
