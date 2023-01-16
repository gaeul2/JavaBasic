package JAVA200.Chapter3;

import java.util.Random;

public class Prac20 {
    public static void main(String[] args) {
        //0,1,2 중 하나의 난수를 생성해서
        // 0이면 "가위", 1이면 "바위 ", 2이면 "보"를 표시하는 프로그램을 작성하자
        Random rd = new Random();

        System.out.print("컴퓨터가 낸것 :");
        int hand = rd.nextInt(3); //0~2사이의 난수

        switch (hand){
            case 0 :
                System.out.println("가위"); break;
            case 1 :
                System.out.println("바위"); break;
            case 2 :
                System.out.println("보"); break;
        }

//        테스트 용
//        for (int i = 0; i<10; i++) {
//            int a = rd.nextInt(3);
//            System.out.print(a);
//            if (a == 0)
//                System.out.println("가위");
//            else if (a == 1 )
//                System.out.println("바위");
//            else System.out.println("보");
//        }
    }
}
