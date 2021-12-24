public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        int reverse = 0;
        int base = num;
        while(base != 0){
            int lastDigit = base % 10;
            base = (base - lastDigit) / 10;
            reverse = (reverse*10) + lastDigit;
        }

        if(reverse == num)
            return true;
        else
            return false;
    }
}
