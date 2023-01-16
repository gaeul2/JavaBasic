package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값 :");
        int a = sc.nextInt();

//        if ( a < 0 ) {
//            System.out.println("음의 정숫값을 입력했습니다.");
//        }
//        else if ( a % 5 == 0) {
//            System.out.println("이 값은 5로 나누어집니다.");
//        }
//        else System.out.println("이 값은 5로 나누어지지 않습니다.");
//    }

        if ( a > 0 ) {
            if ( a % 5 == 0){
                System.out.println("이 값은 5로 나누어집니다.");
            } else System.out.println("이 값은 5로 나누어지지 않습니다.");
        } else System.out.println("음의 정숫값을 입력했습니다");

    }
}
