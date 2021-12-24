public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0)
            return -1.0d;
        else
            return Math.PI * radius * radius;
    }

    public static double area(double radius1, double radius2){
        if(radius1 < 0 || radius2 < 0)
            return -1.0d;
        else
            return radius1 * radius2;
    }
}
