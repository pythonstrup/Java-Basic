public class Main {
    public static void main(String[] args){
        BarkingDog b = new BarkingDog();
        System.out.println(b.shouldWakeUp(true, 4));
        System.out.println(b.shouldWakeUp(true, 12));

        LeapYear l = new LeapYear();
        System.out.println(l.isLeapYear(-1600));
        System.out.println(l.isLeapYear(1600));

        double var1 = -3.1756;
        double var2 = -3.175;
        System.out.println((Math.floor(var1 * 1000) / 1000.0));
        System.out.println((Math.floor(var2 * 1000) / 1000.0));
    }
}
