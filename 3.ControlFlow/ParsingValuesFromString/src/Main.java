public class Main {
    public static void main(String[] args){
        String numberAsString = "2018"; // 2018.125로 하면 error
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);
        System.out.println("Double number = " + doubleNumber);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
