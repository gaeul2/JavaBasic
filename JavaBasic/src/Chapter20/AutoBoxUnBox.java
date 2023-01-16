package Chapter20;

public class AutoBoxUnBox {
    public static void main(String[] args) {
        Integer iObj = 10; //new Integer가 아닌 수가 옴. 알아서 오토 박싱진행
        Double dObj = 3.14; // 오토박싱 진행

        int num1 = iObj; // intValue()로 꺼내서 변수에 넣어야하는데 인스턴스가 옴. 알아서 오토 언박싱진행
        double num2 = dObj; //오토 언박싱진행

        Integer num = 10;
        num++; //new Integer(num.intValue() + 1);로 오토박싱과 오토언박싱 동시에 진행
        /*즉 컴파일러가 알아서 하는데 이게 눈에안보이는 작업이므로 그냥 new~~로 코드작성하는 사람도 많다.
        왜? 안정성을 위해
         */
        num += 3; //new Integer(num.intValue() + 3); 오토박싱과 오토 언박싱 동시에 진행

        int r = num + 5; //오토 언박싱 진행
        Integer rObj = num - 5;// 오토 언박싱 진행
    }
}
