public class EvenDigitSum {
    public static int getEvenDigitSum(int num){
        if (num < 0)
            return -1;

        int base = num;
        int sum = 0;
        while (base > 0) {
            int lastDigit = base % 10;

            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            base /= 10;
        }
        return sum;
    }
}
