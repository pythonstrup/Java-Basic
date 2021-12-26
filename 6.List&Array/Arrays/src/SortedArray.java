import java.util.Scanner;

public class SortedArray {
    //private static Scanner scanner = new Scanner(System.in);

    public static int[] getInters (int size){
        Scanner scanner = new Scanner(System.in);
        int[] value = new int[size];

        for(int i = 0; i<size; i++){
            value[i] = scanner.nextInt();
        }

        return value;
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] Array){
        int[] array = new int[Array.length];
        for(int i =0; i<array.length; i++){
            array[i] = Array[i];
        }

        for(int i = array.length-1; i>0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] < array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }
}
