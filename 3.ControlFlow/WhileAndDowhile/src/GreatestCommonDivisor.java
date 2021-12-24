public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10)
            return -1;

        int big, small;
        if(num1 > num2){
            big = num1;
            small = num2;
        } else {
            big = num2;
            small = num1;
        }
        int greatest = 1;
        for(int i = small; i > 0; i--){
            if(big % i == 0 && small % i == 0){
                greatest = i;
                break;
            }
        }
        return greatest;
    }
}
