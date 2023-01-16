package JAVA200.Chapter7;

import java.util.Scanner;

class Signof1{
    static int prove(int n){
        if(n < 0) return -1;
        else if (n == 0) return 0;
        else return 1;
    }
}
public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력하세요. "); int n = sc.nextInt();
        int result = Signof1.prove(n);
        switch (result){
            case 1:
                System.out.println("양수"); break;
            case -1:
                System.out.println("음수");break;
            case 0:
                System.out.println(0);break;
        }
        System.out.println();
        
    }
}
