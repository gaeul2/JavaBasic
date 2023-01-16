package Chapter12;

public class ToStringEx {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("12");
        System.out.println(str1.toString());
        System.out.println(str1);

        Box box1 = new Box("Camera");
        System.out.println(box1);
        System.out.println(box1.toString());
    }

}

class Box {
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }
    public String toString() { // 얘없으면 클래스 주소 반환함
        return conts; // 문자열 반환
    }
}
