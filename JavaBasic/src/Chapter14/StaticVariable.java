package Chapter14;

public class StaticVariable {
}

class SuperCLS{
    static int count = 0; // private가 아닌 클래스변수

    public SuperCLS(){
        count++; //클래스 내에서는 직접접근이 가능
    }
}

class SubCLS extends SuperCLS{
    public void showCount() {
        System.out.println(count);
    }
}

class TestThisCLS {
    public static void main(String[] args) {
        SubCLS ex1 = new SubCLS();
        ex1.showCount();
    }
}
