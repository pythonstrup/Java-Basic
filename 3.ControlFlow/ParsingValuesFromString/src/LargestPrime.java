public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int i = 2;
        int j = number;
        int k = 0;
        while(i <= number / 2){
            while (j % i == 0){
                j /=i;
                k = i;
            }
            i++;
        }
        if(k != 0){
            return k;
        }
        else{
            return number;
        }
    }
}
