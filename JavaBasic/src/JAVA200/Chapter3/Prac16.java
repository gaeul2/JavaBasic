package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac16 {
    public static void main(String[] args) {
        /* 키보드에서 입력한 정숫 값 중 중앙값을 구해서 표시하는 프로그램을 작성하자
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값1 : ");
        int a = sc.nextInt();
        System.out.print("정수값2 : ");
        int b = sc.nextInt();
        System.out.print("정수값3 : ");
        int c = sc.nextInt();

        int med;
        if (a >= b) {
            if (b >= c)
                med = b;
            else if (a <= c) {
                med = a;
            } else med = c;
        } else if (a > c){ // a < b && a > c
            med = a;
        } else if (b < c) { // a < b && b < c
                med = b;
        } else med = c;

        System.out.println("중간값은 " + med + "입니다.");
    }
}
