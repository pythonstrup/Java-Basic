public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2) {
        return (int) (var1 * 1000) == (int) (var2 * 1000);
    }
}