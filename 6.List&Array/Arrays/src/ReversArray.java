import java.util.Arrays;

public class ReversArray {
    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        for(int i = 0; i<(array.length/2); i++){
            int tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
