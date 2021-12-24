import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int sum = 0;

        while(true){

            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                total++;
            } else {
                break;
            }

        }

        long avg = Math.round((double)sum/total);
        System.out.println("SUM = " + sum + " AVG = " + avg);


        scanner.close();
    }
}
