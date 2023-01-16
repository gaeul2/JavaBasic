package Chapter19;

public class StringEquality {
    public static void main(String[] args) {
        String str1 = new String("So Simple");
        String str2 = new String("So Simple");

        // 참조대상을 비교하는 if~else문
        if(str1 == str2)
            System.out.println("str1, str2 참조대상 동일");
        else
            System.out.println("str1, str2 참조대상 다르다.");

        // 두 인스턴스 내용 비교하는 if~else문
        if(str1.equals(str2))
            System.out.println("str1, str2 참조대상 동일");
        else System.out.println("str1, str2 내용다름");
    }
}
