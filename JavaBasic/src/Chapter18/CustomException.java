package Chapter18;

import java.util.Scanner;

public class CustomException extends Exception {
    public CustomException(){
        super("유효하지 않은 숫자가 입력되었습니다.");
        // Throwable클래스의 getMessage메소드가 반환된 문자열 지정
    }
}

class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력: ");
        try {
            int age = readAge();
            System.out.printf("입력된 나이 : %d \n", age);
        }
        catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readAge() throws CustomException {
        Scanner kb = new Scanner(System.in);
        int age= kb.nextInt();

        if (age < 0) {
            throw new CustomException(); // 예외 생성. 우리가 만든 예외클래스로
            //throws와 throw는 다르다!
        }
        return age;

    }
}
