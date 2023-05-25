package recursividad;
import java.util.Arrays;

public class Recursion {
    
    public int calcPotencia (int base, int exponente) {
        if (exponente == 1)
            return base;
        else 
            return base * calcPotencia(base, exponente-1);
    }
    
    public static int sumArray(int[] array) {
        if (array.length == 1) {
            return array[0];
        } else {
             int[] subarray = getSubarray(array, 1, array.length);
//            int[] subarray = Arrays.copyOfRange(array, 1, array.length);
            return array[0] + sumArray(subarray);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(sumArray(a));
    }

    public static int[] getSubarray(int[] array, int startIndex, int endIndex) {
        int newLength = endIndex - startIndex + 1;
        int[] subarray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            subarray[i] = array[startIndex + i];
        }
        return subarray;
    }

}
