public class NumberToWords {
    public static void numberToWords(int number){
        int num = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= getDigitCount(number); i++) {
            int lastDigit = num % 10;
            num /= 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
        }
    }

    public static int reverse(int number) {

        int reverseNo = 0;
        int lastDigit;
        for (int i = number; number != 0; number /= 10) {
            lastDigit = number % 10;
            reverseNo = (reverseNo * 10) + lastDigit;
        }
        return reverseNo;
    }

    public static int getDigitCount(int number) {
        int counter = 0;
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;
        for (int i = number; i != 0; i /= 10) {
            counter++;
        }
        return counter;
    }
}
