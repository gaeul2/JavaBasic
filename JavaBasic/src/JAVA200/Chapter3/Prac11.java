package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac11 {
    public static void main(String[] args) {
        /* 입력한 점수에 따라 수/우/미/양/가 판정
                - 수 : 80~100
                - 우 : 70 ~79
                - 미 : 60~69
                - 양 : 50 ~59
                - 가 : 0 ~49
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 : ");
        int a = sc.nextInt();

        /* 방법 1 : 논리곱 && 사용
        if (a >= 80 && a <=100)
            System.out.println("수");
        else if (a>= 70 && a<=79)
            System.out.println("우");
        else if (a>= 60 && a<=69)
            System.out.println("미");
        else if (a>= 50 && a<=69)
            System.out.println("양");
        else if (a>= 0 && a<=49)
            System.out.println("가");
        else System.out.println("잘못된 점수입니다.");
         */

        /* 방법 2 : 논리합 || 사용
        */
        if (a <0 || a > 100)
            System.out.println("잘못된 점수를 입력하셨습니다.");
        else if (a >= 80)
            System.out.println("수");
        else if (a >= 70)
            System.out.println("우");
        else if (a >= 60)
            System.out.println("미");
        else if (a >= 50)
            System.out.println("양");
        else System.out.println("가");

    }
}
