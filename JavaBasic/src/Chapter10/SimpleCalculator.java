package Chapter10;

public class SimpleCalculator {
    static final double PI = 3.1415;

    static double add(double n1, double n2) { return n1 + n2; }
    static double min(double n1, double n2) { return n1 - n2; }
    static double calCircleArea(double r) { return PI * r * r ; }
    static double calCirclePeri(double r) { return PI * ( r * 2); }
}


class Practice {
    public static void main(String[] args) {
        System.out.println(SimpleCalculator.add(2.0, 3.0));
        System.out.println(SimpleCalculator.min(7.5 ,3.5));
        System.out.println(SimpleCalculator.calCircleArea(1.5));
        System.out.println(SimpleCalculator.calCirclePeri(1.5));
    }
}