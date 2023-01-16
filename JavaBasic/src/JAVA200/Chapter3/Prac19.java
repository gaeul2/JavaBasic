package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac19 {
    public static void main(String[] args) {
        //3개의 정숫값을 오름차순(작은 순) 으로 정렬하는 프로그램
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : "); int a = sc.nextInt();
        System.out.print("정수 b : "); int b = sc.nextInt();
        System.out.print("정수 c : "); int c = sc.nextInt();

        if (a > b){
            int t = a; a = b; b = t; //b와 a 값 바꿈
        }
        if (b > c) {
            int t = b; b = c; c = t; // b와 c값 바꿈
        }
        // c값을 b에 넣은 뒤 a와 한번더 비교
        if (a > b){
            int t = a; a = b; b = t;
        }
        System.out.println("a <= b <= c 가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 c는 " + c + "입니다.");
    }
}
