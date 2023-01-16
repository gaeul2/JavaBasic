package Chapter18;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str); // null출력까지는 문제없음

        try{ int len = str.length(); }
        catch(NullPointerException e){ e.printStackTrace(); }
    }
}
