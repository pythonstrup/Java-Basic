import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if(hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2021 - yearOfBirth;
//
//            if(age >= 0 && age <= 100) {
//                System.out.println("Your name is " + name + ", and yor are " + age + " years old.");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth");
//        }
//
//        scanner.close();


        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        while(count < 5) {
            System.out.println("Enter number #" + count + ":");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Value");
            }
        }
        System.out.println("Sum is " + sum);
        scanner.close();

    }
}
