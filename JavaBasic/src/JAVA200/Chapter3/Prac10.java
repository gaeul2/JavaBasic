package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 양수/ 양수아님
            3으로 나누고 3으로 나누어짐/나머지 1 /나머지 2로 표시
         */
        System.out.print("정숫값 :");
        int a = sc.nextInt();

        if ( a > 0 ){
            switch (a % 3) {
                case 1 :
                    System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
                    break;
                case 2 :
                    System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
                    break;
                default:
                    System.out.println("이 값은 3으로 나누어집니다.");
            }
        } else System.out.println("양수가 아닌 값을 입력했습니다.");

    }
}
