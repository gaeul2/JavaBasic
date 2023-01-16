package Chapter18;

public class ExceptionMessage {
    public static void main(String[] args) {
        md1(3);
        System.out.println("Good bye~");
    }

    public static void md1(int n){
        md2(n, 0);
    }

    public static void md2(int n1, int n2){
        try{
            int r = n1 / n2;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
