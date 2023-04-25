package Arreglos;

public class ArreglosCombinados {
    public static void main(String[] args) {
        int [] a = new int[10];
        int [] b = new int[10];
        int [] c = new int [20];
        for (int z = 0 ; z< a.length; z++){
            a[z] = z;
        }
        for(int x = 0 ; x<b.length; x++){
            b[x] = (x+1)*5;
        }
        int aux = 0;
        for(int y = 0; y<10 ; y++){
            c[aux++] = a[y];
            c[aux++] = b[y];

        };
        for(int x = 0; x< c.length ;x++){
            System.out.println(c[x]);
        }
    }
}
