package Chapter11;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Lego";
        String str2 = "lego";
        int cmp;

        if ( str1.equals(str2) )
            System.out.println("두 문자열이 같아요");
        else
            System.out.println("두 문자열은 달라요");

        cmp = str1.compareTo(str2);
        if (cmp == 0)
            System.out.println("두 문자열은 일치합니다.");
        else if (cmp < 0)
            System.out.println("사전의 앞에 위치하는 문자 : " + str1);
        else System.out.println("사전의 앞에 위치하는 문자 : " + str2);

        if ( str1.compareToIgnoreCase(str2) == 0 )
            System.out.println("두 단어는 같아요");
        else
            System.out.println("달라유~");

    }
}
