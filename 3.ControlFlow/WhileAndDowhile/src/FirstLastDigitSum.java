public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;

        int lastDigit = number % 10;
        int FirstDigit = lastDigit;
        int sum = 0;
        int base = number / 10;
        while (base > 0){
            FirstDigit = base % 10;
            base /= 10;
        }
        sum = FirstDigit + lastDigit;
        return sum;
    }
}
