public class Main {
    public static void main(String[] args){
        int count =0;
        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }


        count =0;
        while(true){
            if(count == 5)
                break;

            System.out.println("Count value is " + count);
            count++;
        }


        count =0;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while(count != 5);

        NumberPalindrome n = new NumberPalindrome();
        System.out.println(n.isPalindrome(-222));

        FirstLastDigitSum s = new FirstLastDigitSum();
        System.out.println(s.sumFirstAndLastDigit(257));

        EvenDigitSum e = new EvenDigitSum();
        System.out.println(e.getEvenDigitSum(20));

        PerfectNumber p = new PerfectNumber();
        System.out.println(p.isPerfectNumber(28));
    }
}
