public class SumOddRange {
    public static boolean isOdd(int num){
        if(num > 0){
            return (num%2) == 1;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if(start > end)
            return -1;

        if (start < 1 || end < 1)
            return -1;

        int sum = 0;
        for (int i = start; i <= end; i++){
            if(isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
