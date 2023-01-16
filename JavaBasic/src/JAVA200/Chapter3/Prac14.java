package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac14 {
    public static void main(String[] args) {
        /* 두 정수값의 차가 10이하인 경우
            두 값의 차는 10이하입니다.
            두 값의 차는 11이상입니다.

            방법1 : if문
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값1 : ");
        int a = sc.nextInt();

        System.out.print("정수값2 : ");
        int b = sc.nextInt();

        /*
        int diff = (a >= b)? a - b : b - a;
        if (diff >= 11)
            System.out.println("두 값의 차는 11이상입니다.");
        else System.out.println("두 값의 차는 10이하입니다.");
        */

        // 방법2 : 삼항연산자
        int diff = (a >= b)? a - b : b - a;
        System.out.println("두 값의 차는 " + ((diff <= 10)? "10이하" : "11이상") + "입니다.");
    }
}
