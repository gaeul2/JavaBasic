package Chapter20;

import java.math.BigInteger;

public class SoBigInteger {
    public static void main(String[] args) {
        //long형으로 표현 가능한 값의 크기 출력
        System.out.println("최대 정수 : " + Long.MAX_VALUE);
        System.out.println("최소 정수 : " + Long.MIN_VALUE);
        System.out.println();

        //매우 큰 수를 BigInteger 인스턴스로 표현
        BigInteger big1 = new BigInteger("10000000000000000000000000");
        BigInteger big2 = new BigInteger("-9999999999999999999999999");
        /* 왜 BigInteger()안에 ""이지?
            그냥 숫자로 넣으면 컴파일러가 함수실행도 전에 Long형의 최대/최소값을 벗어났기때문에
            실행해주지 않음.
         */

        //BigInteger 기반 덧셈 연산
        BigInteger r1 = big1.add(big2);
        System.out.println("덧셈 결과 : " + r1);

        //BigInteger 기반 곱셈 연산
        BigInteger r2 = big1.multiply(big2);
        System.out.println("곱셈 결과 :" + r2);
        System.out.println();

        //인스턴스에 저장된 값을 int형 정수로 반환
        int num = r1.intValueExact();// BigInteger를 int로 반환해줌
        System.out.println("From BigInteger : " + num);
    }
}
