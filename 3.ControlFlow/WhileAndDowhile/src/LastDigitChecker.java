public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1 >= 10 && num1 <= 1000 && num2 >= 10 && num2 <= 1000 && num3 >= 10 && num3 <= 1000){
            int l1 = (num1 % 10), l2 = (num2 % 10), l3 = (num3 % 10);
            return (l1 == l2 || l2 == l3 || l3 == l1) ? true : false;
        } else {
            return false;
        }
    }

    public static boolean isValid(int num){
        if(num >= 10 && num <=1000)
            return true;
        else
            return false;
    }
}
