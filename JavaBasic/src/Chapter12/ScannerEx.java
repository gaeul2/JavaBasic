package Chapter12;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        // String source 전달
        /*
        String source = "1 3 5";
        Scanner sc = new Scanner(source);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, sum);
         */

        // 키보드 입력전달
        Scanner sc = new Scanner(System.in);
        /*
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, sum);
        */
        System.out.print("문자열 입력 : ");
        String str1 = sc.nextLine();

        System.out.print("문자열 입력 : ");
        String str2 = sc.nextLine();

        System.out.printf("입력된 문자열1 : %s \n", str1);
        System.out.printf("입력된 문자열2 : %s \n", str2);

    }
}
