package JAVA200.Chapter3;

import java.util.Scanner;

public class Prac17 {
    public static void main(String[] args) {
        //2개의 정숫값중 작은값과 큰 값표시, 같으면 같다고 표시
        Scanner sc = new Scanner(System.in);
        System.out.print("정숫값1 : "); int n1 = sc.nextInt();
        System.out.print("정숫값2 : "); int n2 = sc.nextInt();

        if ( n1 == n2 ){
            System.out.println("두 값이 같습니다.");
        } else {
            int max, min;
            if (n1 > n2) {
                max = n1;
                min = n2;
            } else {
                max = n2;
                min = n1;
            }
        System.out.println("큰 값은 " + max + "입니다.");
        System.out.println("작은 값은 " + min + "입니다.");
        }
    }
}
