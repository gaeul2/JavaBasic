package Chapter18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        System.out.print("a/b ...a? ");
        int n1 = sc.nextInt();

        System.out.print("a/b ...b? ");
        int n2 = sc.nextInt();

        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        }
        catch (ArithmeticException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Good bye~~!");
    }
}
