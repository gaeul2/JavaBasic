package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac18 {
    public static void main(String[] args) {
        //2개의 정수값을 내림차순(큰순)으로 정렬하는 프로그램
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : "); int a = sc.nextInt();
        System.out.print("정수 b : "); int b = sc.nextInt();

        if (a<b){
            int t = a;
            a = b;
            b = t;
        }
        System.out.println( "a>=b가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");

    }
}
