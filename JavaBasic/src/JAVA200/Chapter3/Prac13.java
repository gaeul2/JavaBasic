package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac13 {
    public static void main(String[] args) {
        /* 2개의 정수값의 차를 표시하는 프로그램
            차를 따로 다른 변수에 저장할것
        방법 1 : if
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1 : ");
        int a = sc.nextInt();
        System.out.print("정수 2 : ");
        int b = sc.nextInt();

        /*
        int diff;
        if ( a > b ){
            diff = a - b;
            System.out.println(diff);
        } else if ( a < b ) {
            diff = b - a;
            System.out.println(diff);
        } else System.out.println(0);
         */

        //방법 2 : 3항연산자
        int diff = (a >= b)? a - b : b - a;
        System.out.println(diff);
    }
}
