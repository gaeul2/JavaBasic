package Chapter20;

public class BoxUnBox {
    public static void main(String[] args) {
        Integer iObj = new Integer(10);// 박싱
        Double dObj = new Double(3.14);

        int num1 = iObj.intValue(); // 언박싱
        double num2 = dObj.doubleValue(); // 언박싱
        System.out.println("-----------늘리기 작업 전-----------");
        System.out.println(num1);
        System.out.println(num2);

        /*
        래퍼 인스턴스 값의 증가방법
            new Integer, new Double등의 래퍼클래스로 생성된 인스턴스값은
            immutable함. (String처럼.) 따라서, 연산을 위해서는
            000Value();로 값을 꺼내서(꺼낸다고 사라지지 않음)
            그 값에 + 10한것을 래퍼클래스로 다시 감쌈. 즉 연산결과를 래퍼클래스로 생성
         */

        iObj = new Integer(iObj.intValue() + 10);
        dObj = new Double(dObj.doubleValue() + 1.2);

        System.out.println("-----------늘리기 작업 후-----------");
        System.out.println(iObj);
        System.out.println(dObj);
    }
}
