package Chapter11;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder strEx = new StringBuilder("123");

        strEx.append(45678); //문자열 덧붙이기
        System.out.println(strEx.toString());

        strEx.delete(0, 2); // 문자열 일부 삭제
        System.out.println(strEx.toString());

        strEx.replace(1,5,"--");//문자열 일부 교체
        System.out.println(strEx.toString());

        strEx.reverse(); // 문자열 뒤집기
        System.out.println(strEx.toString());

        String word = strEx.substring(0,3); // 일부만 문자열로 반환
        System.out.println(word);
    }
}
