public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 >= 10 && num1 <=99 && num2 >= 10 && num2 <= 99){
            int f1 = (num1 / 10), l1 = (num1 % 10);
            int f2 = (num2 / 10), l2 = (num2 % 10);
            if(f1 == f2 || f1 == l2 || l1 == f2 || l1 == l2)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }
}
