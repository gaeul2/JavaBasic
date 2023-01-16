package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac15 {
    public static void main(String[] args) {
        /*키보드에서 입력한 3개의 정수중 최솟값 구하기
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값1 : "); int a = sc.nextInt();
        System.out.print("정수값2 : "); int b = sc.nextInt();
        System.out.print("정수값3 : "); int c = sc.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("최소값은 " + min + "입니다.");

    }
}
