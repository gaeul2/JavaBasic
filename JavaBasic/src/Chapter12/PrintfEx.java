package Chapter12;

public class PrintfEx {
    public static void main(String[] args) {
        System.out.printf("정수는 %d 실수는 %f 문자는 %c", 12, 24.5, 'A');
        System.out.println();

        int age = 20;
        double height = 178.2;
        String name = "YOON SUNG WOO";

        System.out.printf("name : %s \n", name);
        System.out.printf("age : %d \nheight : %e \n\n", age, height);

        System.out.printf("%d - %o - %x \n\n", 77, 77, 77);
        System.out.printf("%g \n", 0.00014);
        System.out.printf("%g \n", 0.000014);

    }
}
