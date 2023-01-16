package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac12 {
    public static void main(String[] args) {
        /* 두개의 실숫값 중 큰 값을 표시하는 프로그램
            방법1 : if 문
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("실수1 : ");
        double f1 = sc.nextDouble();

        System.out.print("실수2 : ");
        double f2 = sc.nextDouble();

//        double max; // 큰 값 저장
//        if ( f1 > f2 ) {
//            max = f1;
//            System.out.println(max);
//        } else if (f1 < f2) {
//            max = f2;
//            System.out.println(max);
//        }
//        else System.out.println("두 값은 같습니다.");

        //방법2 : 삼항연산자
        double max = (f1 > f2)? f1 : f2;
        System.out.println(max);

    }
}
