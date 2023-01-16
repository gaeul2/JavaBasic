package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수값 : ");
        int a = sc.nextInt();

        if ( a > 0) {
            if ( a % 10 == 0) {
                System.out.println("이 값은 10의 배수입니다.");
            } else System.out.println("이 값은 10의 배수가 아닙니다.");
        } else System.out.println("음수값을 입력하셨습니다.");
    }
}
