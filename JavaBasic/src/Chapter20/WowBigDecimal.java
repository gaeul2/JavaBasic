package Chapter20;

import java.math.BigDecimal;


public class WowBigDecimal {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("1.6");
        BigDecimal d2 = new BigDecimal("0.1");
        /* 왜 BigDecimal의 인자로 ""안에 실수를 담죠?
            ""없이 실수를 그냥 적으면 그 순간부터 오차가 존재.
            컴파일러가 1.6을 숫자로 인지 하지 않고 BigDecimal()생성자를 먼저 실행하도록 하기위함.
         */
        System.out.println("덧셈 결과 : " + d1.add(d2));
        System.out.println("곱셈 결과 : " + d1.multiply(d2));
    }
}
